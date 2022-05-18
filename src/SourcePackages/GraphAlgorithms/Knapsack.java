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
public class Knapsack {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    
    static int knapsack(int w, int wt[], int val[], int n){
        if(n ==0 || w == 0) {
            return 0;
        }else if(wt[n-1] > w){
            return knapsack(w, wt, val, n-1);
        }else{
            return max(val[n-1]+knapsack(w-wt[n-1], wt, val, n-1), knapsack(w, wt, val, n-1));
        }
    }
    public void knapsack_algorithm() {
        int val[] = {25, 24, 15};
        int wt[] = {18, 15, 10 };
        int w = 20;
        int n = val.length;
        System.out.println("Value Array: "+Arrays.toString(val));
        System.out.println("Weight Array: "+Arrays.toString(wt));
        System.out.println("max weight: "+w+"\n");
        System.out.println("Optimal Solution: "+knapsack(w, wt, val, n));
    }
}
