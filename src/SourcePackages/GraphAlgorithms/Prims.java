/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.GraphAlgorithms;

import java.util.Arrays;

/**
 *
 * @author jahan
 */
public class Prims {
    int V = 5;

    int minKey(int key[], boolean visited[]) {
        int min = Integer.MAX_VALUE,
                min_index = -1;
        for (int v = 0; v < V; v++) {
            if (visited[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }
        }
        return min_index;
    }

    void primMST(int graph[][]) {
        int parent[] = new int[V];
        int key[] = new int[V];

        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, visited);

            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && visited[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
    }

    void printMST(int parent[], int graph[][]) {
        System.out.println("Edge/Weight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    public void prims_algorithm() {
        Prims prms = new Prims();

        int graph[][] = new int[][]
        {{0, 2, 0, 6, 0},
        {2, 0, 3, 8, 5},
        {0, 3, 0, 0, 7},
        {6, 8, 0, 0, 9},
        {0, 5, 7, 9, 0}};
        System.out.println("Graph: ");
        System.out.println(Arrays.deepToString(graph));
        prms.primMST(graph);
    }
}
