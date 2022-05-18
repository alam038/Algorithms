/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.DataStracture;

import java.util.Scanner;

/**
 *
 * @author jahan
 */
public class Input {
    int i, j, num;
    Scanner sc = new Scanner(System.in);
    
    public int[] sort_input_int() {
        System.out.print("Enter the number of integers to sort: ");
        num = sc.nextInt();
        
        int arr[] = new int[num];
        
        System.out.println("Enter "+num+ " integers: ");
        for(i=0; i<num; i++){
            System.out.print("Enter Number["+(i+1)+"]: ");
            arr[i] = sc.nextInt();
        }
        return arr;
        
    }
    
    public Float[] sort_input_float() {
        System.out.print("Enter the number of Float to sort: ");
        num = sc.nextInt();
        
        Float[] arr = new Float[num];
        
        System.out.println("Enter "+num+ " Floats: ");
        for(i=0; i<num; i++){
            System.out.print("Enter Number["+(i+1)+"]: ");
            arr[i] = sc.nextFloat();
        }
        return arr;        
    }
    
    public double[] sort_input_double() {
        System.out.print("Enter the number of Float to sort: ");
        num = sc.nextInt();
        
        double arr[] = new double[num];
        
        System.out.println("Enter "+num+ " Floats: ");
        for(i=0; i<num; i++){
            System.out.print("Enter Number["+(i+1)+"]: ");
            arr[i] = sc.nextDouble();
        }
        return arr;        
    }
    
    public String[] sort_input_sting() {
        System.out.print("Enter the number of Float to sort: ");
        num = sc.nextInt();
        
        String arr[] = new String[num];
        
        System.out.println("Enter "+num+ " Floats: ");
        for(i=0; i<num; i++){
            System.out.print("Enter Number["+(i+1)+"]: ");
            arr[i] = sc.next();
        }
        return arr;        
    }
    
}
