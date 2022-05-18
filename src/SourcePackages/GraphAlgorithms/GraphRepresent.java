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
public class GraphRepresent {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
    public void indirect_graph(int v){
        for(int i = 0; i < v; i++) {
            arr.add(new ArrayList<>());
        }
    }
    
    void addEdge(int s, int d){
        arr.get(s).add(d);
        arr.get(d).add(s);
    }
    
    public void printGraph() {
        for(int i = 0; i< arr.size(); i++){
            System.out.print("\nVertex "+i+" : ");
            for (int j = 0; j < arr.get(i).size(); j++) {
	        System.out.print(" -> " + arr.get(i).get(j));
            }
        }
    }
    
    public void graph_representation() {
        GraphRepresent gr = new GraphRepresent();
        gr.indirect_graph(4);
        
        gr.addEdge(0, 1);
        gr.addEdge(0, 2);
        gr.addEdge(2, 3);
        gr.addEdge(1, 3);
        
        //System.out.println("Graph: ");
        //System.out.println(Arrays.toString(arr));
        
        gr.printGraph();
        System.out.println("");
    }

}
