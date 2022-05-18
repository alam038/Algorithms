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
public class RadixSort {

    void countingSort(int arr[], int n, int place) {
        int output[] = new int[n + 1];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count[] = new int[max + 1];

        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            count[(arr[i] / place) % 10]++;
        }
        
        
        for(int i = 1; i < 10; i++){
            count[i] += count[i-1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / place) % 10] - 1] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    void sorting(int arr[], int n) {
        int max = getMax(arr, n);
        
        for(int place = 1; max/place > 0; place*=10){
            countingSort(arr, n, place);
        }
    }
    
    public void radix_sort(){
        int arr[] = { 121, 432, 564, 23, 1, 45, 788 };
        int n = arr.length;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("");
        sorting(arr, n);
        System.out.println("Sorted Array (Radix Sort): ");
        System.out.println(Arrays.toString(arr));
    }
}
