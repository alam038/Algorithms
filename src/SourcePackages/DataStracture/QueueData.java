/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.DataStracture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author jahan
 */
public class QueueData {

    Queue<String> que = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    boolean stmt = true;

    public void add_data() {
        try {
            System.out.print("How many Data you want to input: ");
            int count = sc.nextInt();
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter Data[" + i + "]: ");
                que.add(sc.next());
            }
            System.out.println("Data input successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void remove_data() {
        try {
            System.out.print("Enter how many Data you want to remove: ");
            int count = sc.nextInt();
            if (que.isEmpty()) {
                System.out.println("There is no Data.");
            } else {
                for (int i = 1; i <= count; i++) {
                    if (que.isEmpty()) {
                        System.out.println("Data[" + i + "] Out of Bounds. There is no data found in Queue[" + i + "].");
                        break;
                    } else {
                        que.remove();
                    }
                }
                if(que.size()>count){
                    System.out.println("Data remove complated.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void display() {
        if (que.isEmpty()) {
            System.out.println("The is Empty.");
        } else {
            System.out.println("The Data is: ");
            System.out.println(que);
        }
    }

    public void head() {
        if (que.isEmpty()) {
            System.out.println("The Queue is Empty.");
        } else {
            System.out.println("The Head value is: " + que.element());
        }
    }

    public void queue_switch() {

        while (stmt) {
            System.out.println("""
                           
                           ------------Queue------------
                                 0. Exit
                                 1. Add Data
                                 2. Remove DAta
                                 3. Display Data
                                 4. Head Data
                           -----------------------------
                           """);
            System.out.print("Enter your choice: ");

            switch (sc.nextInt()) {
                case 0 -> {
                    stmt = !stmt;
                }
                case 1 -> {
                    add_data();
                }
                case 2 -> {
                    remove_data();
                }
                case 3 -> {
                    display();
                }
                case 4 -> {
                    head();
                }
                default ->
                    System.out.println("You Enter Worng Inpup.");
            }
        }
    }
}
