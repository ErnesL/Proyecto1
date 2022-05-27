/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author ernes
 */
import javaapplication9.Vertice;

public class Graph {

    int numVerts;
    static int maxVerts = 20;
    Vertice[] verts;
    int[][] matAd;

    //Constructor sin argumentos para un maximo de vertices preestablecido
    public Graph() {
        this(maxVerts);
    }

    //Constructor con el numero de vertices establecido
    public Graph(int mx) {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; i < mx; i++) {
                matAd[i][j] = 0;

            }
        }
        numVerts = 0;

    }

    //Comprueba si el vertice del grafo ya esta en la lista de vertices, en caso negativo incrementa el numero de vertices y lo asigna a la lista
    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            verts[numVerts++] = v;
        }
    }

    //Busca el vertice en el array. Devuelve -1 si no lo encuentra.
    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;) {
            encontrado = verts[i].equals(v);
            if (!encontrado) {
                i++;
            }
        }
        return (i < numVerts) ? i : -1;
    }

    // Recibe el nombre de cada vertice, busca en el array el numero de vertice asignado a cada uno de ellos y marca la matriz de adyacencia.
    public void nuevaArista(String a, String b, float weight) throws Exception {
        int va;
        int vb;
        va  = numVertice(a);
        vb = numVertice(b);

        if (va  < 0 || vb < 0) {
            throw new Exception("Vertice no existe");
        }
        matAd[va][vb] = (int) weight;

    }

    //Determina si dos vertices v1 y v2 estan enlazados, es decir, si el elemento de la matriz de adyacencia es mayor o igual a 1.
    public boolean adyacente(String a, String b) throws Exception {
        int va;
        int vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vertice no existe");
        }
        return matAd[va][vb] >= 1;
    }

}
