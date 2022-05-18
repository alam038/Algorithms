/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.DataStracture;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jahan
 */
public class test {

    public static void main(String[] args) throws IOException {
        // list that holds strings of a file
        List<String> listOfStrings
                = new ArrayList<>();

        // read entire line as string
        try ( // load data from file
                BufferedReader bf = new BufferedReader(
                        new FileReader("F:\\JAVA\\NetBeans\\Algorithm_BOU_CSE_6_18052801040\\src\\SourcePackages\\DataStracture\\file.txt"))) {
            // read entire line as string
            String line = bf.readLine();
            // checking for end of file
            while (line != null) {
                listOfStrings.add(line);
                line = bf.readLine();
            }
            // closing bufferreader object
        }

        // storing the data in arraylist to array
        String[] array
                = listOfStrings.toArray(String[]::new);

        // printing each line of file
        // which is stored in array
        int j = 0;
        int arr[] = new int[7];

        for (String str : array) {
            String strg = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {

                } else {
                    if (str.charAt(i) == ',') {
                        arr[j] = Integer.parseInt(strg);
                        j++;
                        strg = "";
                    } else {
                        strg += String.valueOf(str.charAt(i));
//                  arr[j] = Integer.parseInt(String.valueOf(str.charAt(i)));
//                  j++;
                    }
                }
            }
        }
        System.out.println("arr: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int key = arr[i];
            int count = i;
            for (int k = i + 1; k < arr.length; k++) {
                if (key > arr[k]) {
                    key = arr[k];
                    count = k;
                }
            }
            int temp = arr[i];
            arr[i] = key;
            arr[count] = temp;
        }
        System.out.println("sorted arr: " + Arrays.toString(arr));
    }
}
