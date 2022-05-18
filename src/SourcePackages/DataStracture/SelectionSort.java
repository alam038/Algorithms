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
public class SelectionSort {

    public void selection_sort(int[] arr) {
        int len = arr.length;
        int min_value;

        for (int i = 0; i < len - 1; i++) {
            min_value = arr[i];
            int count = i;
            for (int j = i + 1; j < len; j++) {
                if (min_value > arr[j]) {
                    count = j;
                    min_value = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = min_value;
            arr[count] = temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
       
    public Float[] selection_sort_float(Float[] arr) {
        int len = arr.length;
        float min_value;

        for (int i = 0; i < len - 1; i++) {
            min_value = arr[i];
            int count = i;
            for (int j = i + 1; j < len; j++) {
                if (min_value > arr[j]) {
                    count = j;
                    min_value = arr[j];
                }
            }
            float temp = arr[i];
            arr[i] = min_value;
            arr[count] = temp;
        }
        return arr;
    }
}
