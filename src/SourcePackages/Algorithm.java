/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages;

import SourcePackages.Switch.Algo_Switch;
import SourcePackages.Switch.DataStruc_Switch;
import java.util.Scanner;

/**
 *
 * @author jahan
 */
public class Algorithm {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true){
            
            System.out.println("""
                               
                               ========*Computer Algorithms*=========
                                        0. Exit
                                        1. Data Structure
                                        2. Algorithm
                               ======================================
                               """);
            System.out.print("Enter Choice: ");
            int choise = sc.nextInt();
            switch (choise) {
                case 0 -> {
                    System.exit(0);
                }
                case 1 -> {
                    DataStruc_Switch ds = new DataStruc_Switch();
                    ds.dataStructureSwitch();
                }
                case 2 -> {
                    Algo_Switch alSwitch = new Algo_Switch();
                    alSwitch.Algorithm_Switch();
                }
                default -> System.out.println("You choise wrong number.");
            }
        }
    }
    
}
