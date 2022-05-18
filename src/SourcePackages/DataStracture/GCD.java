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
public class GCD {

    public int gcd(int a, int b) {
        if (a < b) {
            if (a == 0) {
                return b;
            } else {
                return gcd(b % a, a);
            }
        } else {
            if (b == 0) {
                return a;
            } else {
                return gcd(a % b, b);
            }
        }
    }
    
    public void gcd_value() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number for GCD: ");
        System.out.print("Number[1]: ");
        int num1 = sc.nextInt();
        System.out.print("Number[2]: ");
        int num2 = sc.nextInt();
        System.out.println("GCD: "+gcd(num1, num2));
        System.out.println("");
    }

}
