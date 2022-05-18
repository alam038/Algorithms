/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.DataStracture;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jahan
 */
public class Linked_List {

    LinkedList<String> ll = new LinkedList<>();

    Scanner s = new Scanner(System.in);

    public void add_data() {
        try {
            System.out.print("Enter How many Data do you Input: ");
            int x = s.nextInt();
            for (int i = 0; i < x; i++) {
                System.out.print("Enter Data [" + i + "]: ");
                ll.add(i, s.next());
            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println(e);
        }
    }

    public void display_data() {
        System.out.println(ll);
    }

    public void remove_data() {
        try {
            System.out.print("Enter the index number which you want to delete: ");
            ll.remove(ll.get(s.nextInt()));
        } catch (Exception e) {
            System.out.println("");
            System.out.println(e);
        }
    }

    public void replace_data() {
        try {
            System.out.print("Enter index number: ");
            int i = s.nextInt();
            System.out.print("Enter Replace Data: ");
            ll.set(i, s.next());
        } catch (Exception e) {
            System.out.println("");
            System.out.println(e);
        }
    }

    public void linked_switch() {
        boolean link_stmt = true;
        while (link_stmt) {
            System.out.println("""
                               
                               -----------Link List--------
                                    0. Exit
                                    1. Insert
                                    2. Delete
                                    3. Replace
                                    4. Display Data
                               ----------------------------
                               """);
            System.out.print("Enter your choice: ");
            int index = s.nextInt();
            switch (index) {
                case 0 -> {
                    link_stmt = !link_stmt;
                }
                case 1 -> {
                    add_data();
                }
                case 2 -> {
                    remove_data();
                }
                case 3 -> {
                    replace_data();
                }
                case 4 -> {
                    display_data();
                }
                default ->
                    System.out.println("Something Wrong!");
            }
        }
    }
}
