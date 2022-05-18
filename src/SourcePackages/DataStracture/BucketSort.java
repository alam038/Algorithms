/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.DataStracture;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jahan
 */
public class BucketSort {
    
    public void bucket_sort(Float[] arr) {
        int len = arr.length;

        ArrayList<Float>[] al = new ArrayList[10];
        
        // Create 10 bucket(al[index]) List in al ArrayList...
        for (int i = 0; i < 10; i++) {
            al[i] = new ArrayList<>();
        }
        
        /* *Add Array Elements(arr[i]) in bucket(al[index]) List. Where index is ( Array Element * 10 ) 
        *  and this value (( Array Element * 10 )) need to type casting to integer....
        * */
        for (int i = 0; i < len; i++) {
            int bi = (int) (10 * arr[i]);
            al[bi].add(arr[i]);
        }

        int pos = -1; // Declared for arr index....
        
        // Sort all bucket(al) List
        for (int x = 0; x < al.length; x++) {
            int size = al[x].size();

            if (size != 0) {
                // Use Selection Sort for sorting bucket(al[x]) list....
                for (int i = 0; i < size - 1; i++) { 
                    float min_value = al[x].get(i);
                    int count = i;

                    for (int j = i + 1; j < size; j++) {
                        if (min_value > al[x].get(j)) {
                            count = j;
                            min_value = al[x].get(j);
                        }
                    }

                    float temp = al[x].get(i);
                    al[x].set(i, min_value);
                    al[x].set(count, temp);
                }
                // End Selection Sort
                
                // Insert data in original array from sorted bucket(al[x]) List....
                for (int k = 0; k < size; k++) {
                    arr[++pos] = al[x].get(k);
                }
            }
        }

        System.out.println("");
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
