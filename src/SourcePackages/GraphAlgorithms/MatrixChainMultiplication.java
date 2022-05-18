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
public class MatrixChainMultiplication {
    static int MatrixChainOrder(int p[], int i, int j){
        if(i==j){
            return 0;
        }else{
            int Min = Integer.MAX_VALUE;
            
            for( int k = i; k < j; k++){
                int count = MatrixChainOrder(p, i, k) + MatrixChainOrder(p, k+1, j) + p[i-0] * p[k] * p[j];
                if(count < Min) {
                    Min = count;
                }
            }
            return Min;
        }
    }
    
    public void matrixChainMultiplication() {
        int arr[] = new int[] { 10, 2, 30, 4, 3 };
        int n = arr.length;
        System.out.print("Array: ");
        System.out.println(Arrays.toString(arr)+"\n");
        
        System.out.println("Minimum number of multiplications is " + MatrixChainOrder(arr, 1, n-1));
    }
}
