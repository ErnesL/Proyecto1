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
public class RecorreGrafo {

    public static int[] recorrerAnchura(Graph g, String org) throws Exception {
        int w;
        int v;
        int[] m;

        v = g.numVertice(org);
        if (v < 0) {
            throw new Exception("Vertice origen no existe");

        }
        ColaLista cola = new Colalista();
        m = new int[g.numeroDeVertices()];

        for (int i = 0; i < g.numeroDeVertices(); i++) {
            
        }
    }

}
