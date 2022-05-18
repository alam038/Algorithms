/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.DataStracture;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jahan
 */
public class StackData {

    Stack<String> stk = new Stack<>();
    Scanner sc = new Scanner(System.in);
    boolean stmt = true;

    public void push_data() {
        try {
            System.out.print("Enter How many Data you want to input: ");
            int count = sc.nextInt();
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter Data ["+i+"]: ");
                stk.push(sc.next());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void pop_data() {
        try {
            System.out.print("Enter How many Data you want to Remove: ");
            int count = sc.nextInt();
            if(stk.empty()==true){
                System.out.println("There is no Data.");
            }else{
                for (int i = 0; i < count; i++) {
                if (stk.empty() == true) {
                    System.out.println("Data["+(i+1)+"] Out of Bounds. There is no data found in Stack["+(i+1)+"].");
                    break;
                } else {
                    stk.pop();
                }
            }
                if(stk.size()>count){
                    System.out.println("Data remove complated.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void top() {
        if (stk.empty() == true) {
            System.out.println("There is no Data.");
        } else {
            System.out.println("The Top value is " + stk.peek());
        }
    }

    public void display() {
        if (stk.empty() == true) {
            System.out.println("The Stack is Empty");
        } else {
            System.out.println("The Data are: ");
            System.out.print(stk);
        }
    }

    public void stack_switch() {
        while (stmt) {
            System.out.println("""
                               
                               ------------Stack------------
                                     0. Exit
                                     1. Push
                                     2. Pop
                                     3. Display Data
                                     4. Top Data
                               -----------------------------
                               """);
            System.out.print("Enter your choice: ");
            switch (sc.nextInt()) {
                case 0 -> {
                    stmt = !stmt;
                }
                case 1 -> {
                    push_data();
                }
                case 2 -> {
                    pop_data();
                }
                case 3 -> {
                    display();
                }
                case 4 -> {
                    top();
                }
                default ->
                    System.out.println("You Enter Worng Inpup.");
            }
        }
    }

}
