/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.GraphAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jahan
 */
public class Input_Graph {
    
    LinkedList<Integer> adj = new LinkedList();
    
    
    
    public LinkedList<Integer>[] direct_graph_arr(){
        System.out.print("Enter node Length: ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        LinkedList<Integer> arr[];
        arr = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            arr[i] = new LinkedList<>();
        }
        
        for(int i = 0; i < v; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            arr[s].add(d);
        }
        return arr;
    }
    public ArrayList<ArrayList<Integer>> indirect_graph(){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        System.out.print("Enter Graph Length: ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        for(int i = 0; i < v; i++) {
            arr.add(new ArrayList<>());
        }
        
        for(int i = 0; i < v; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            arr.get(s).add(d);
            arr.get(d).add(s);
        }
        return arr;
    }
}
