/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.GraphAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jahan
 */
public class Dijkstra {
    public Dijkstra(){
        
    }
    private static void dijkstra(int[][] adj){
        int v = adj.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0] = 0;
        for(int i = 1; i < v; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < v-1; i++){
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            
            for(int j = 0; j<v; j++){
                if(adj[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
                    int newDist = distance[minVertex] + adj[minVertex][j];
                    if(newDist < distance[j]){
                        distance[j] = newDist;
                    }
                }
            }
        }
        
        //Print
        for(int i=0; i<v; i++){
            System.out.println(i+" "+distance[i]);
        }
    }
    
    public static int findMinVertex(int distance[], boolean visited[]){
        int minVertex = -1;
        for(int i = 0; i<distance.length; i++){
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }
    
    public void dijstra() {
        Scanner sc = new Scanner(System.in);
        //int v = sc.nextInt();
        //int e = sc.nextInt();
        
        //int adj[][] = new int[v][v];
        int adj[][] = new int[5][5];

        /*for(int i=0; i<e; i++){
            int v1= sc.nextInt();
            int v2= sc.nextInt();
            int weight = sc.nextInt();
            adj[v1][v2]=weight;
            adj[v2][v1]=weight;
        }*/
        adj[0][1] = 4;
        adj[1][0] = 4;
        adj[0][2] = 8;
        adj[2][0] = 8;
        adj[1][3] = 5;
        adj[3][1] = 5;
        adj[1][2] = 2;
        adj[2][1] = 2;
        adj[2][3] = 5;
        adj[3][2] = 5;
        adj[2][4] = 9;
        adj[4][2] = 9;
        adj[3][4] = 4;
        adj[4][3] = 4;
        System.out.println("Graph: ");
        System.out.println(Arrays.deepToString(adj));
        System.out.println("");
        dijkstra(adj);
    }
}
