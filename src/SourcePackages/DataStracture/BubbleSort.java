/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.DataStracture;

import java.util.Arrays;

/**
 *
 * @author jahan
 */
public class BubbleSort {
    
    public void bubble_sort( int arr[] ){
        int n = arr.length;
        System.out.println("Original Arrays: "+Arrays.toString(arr));
        for(int i = 0; i < n-1; i++){
            System.out.println("Pass["+(i+1)+"]: ");
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("Swap["+(j+1)+"]: "+Arrays.toString(arr));
            }
            System.out.println("Pass["+(i+1)+"]: "+Arrays.toString(arr));
            System.out.println("");
        }
        System.out.println("Sorted Data: ");
        for(int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
    }
}
