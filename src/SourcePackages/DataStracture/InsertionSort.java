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
public class InsertionSort {

    public void insertion_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int key = arr[i + 1];
            int j = i;

            do {
                int temp = arr[j];
                arr[j] = key;
                arr[j + 1] = temp;
                j--;
            } while (j >= 0 && arr[j] > key);

        }
        System.out.println("");
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
