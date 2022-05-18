/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.GraphAlgorithms;

import java.util.*;

/**
 *
 * @author jahan
 */
public class DFS {
    int V;
    LinkedList<Integer> arr[];

    public DFS(int v) {
        V = v;
        arr = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            arr[i] = new LinkedList<>();
        }
    }

    void addEdge(int s, int d) {
        arr[s].add(d);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = arr[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    public void dfs() {
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);
        
        System.out.println("Graph: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("");
        
        boolean visited[] = new boolean[V];
        System.out.println("""
                           Following is Depth First Traversal 
                           (starting from vertex 2)""");
        DFSUtil(2, visited); // vertex = 2
    }
}
