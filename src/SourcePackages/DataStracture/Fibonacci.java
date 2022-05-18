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
public class Fibonacci {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public void fibo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();
        System.out.print("Fibonacci serice(Using Recursion): ");
        for(int i=0; i<=num; i++ ){
            System.out.print(fib(i)+" ");
        }
        System.out.println("");
        fib_serice(num);
        System.out.println("");
    }

    public void fib_serice(int num) {
        int sum = 0;
        int prev1 = 1, curr = 0, prev2 = 0;
        System.out.print("Fibonacci Serice(Without Recursion): ");
        for (int i = 0; i <= num; i++) {
            sum += curr;
            System.out.print(" " + curr);
            prev2 = prev1;
            prev1 = curr;
            curr = prev1 + prev2;
        }
        System.out.println("");
        System.out.println("Sum of Fibonacci: " + sum);
        System.out.println("");
    }

}
