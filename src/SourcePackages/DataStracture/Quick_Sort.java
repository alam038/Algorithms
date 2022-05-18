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
public class Quick_Sort {
    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        
        
        for(int j = low; j <= high - 1; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }else{}
            //System.out.println("i: "+i);
            //System.out.println("j: "+j);
            //System.out.println("pi: "+pivot);
            //System.out.println("Arr1: "+Arrays.toString(arr));
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    
    void quick_sort(int arr[], int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quick_sort(arr, low, pi-1);
            //System.out.println("Arr1: "+Arrays.toString(arr));
            quick_sort(arr, pi+1, high);
            //System.out.println("Arr2: "+Arrays.toString(arr));
        }
    }
    
    public void quick_sort() {
        int arr[] = {10, 80, 30, 50, 90, 70};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        
        Quick_Sort qs = new Quick_Sort();
        qs.quick_sort(arr, 0, (arr.length-1));
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
}
