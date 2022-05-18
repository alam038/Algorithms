/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.Switch;

import SourcePackages.DataStracture.BubbleSort;
import SourcePackages.DataStracture.BucketSort;
import SourcePackages.DataStracture.Fibonacci;
import SourcePackages.DataStracture.GCD;
import SourcePackages.DataStracture.QueueData;
import SourcePackages.DataStracture.Linked_List;
import SourcePackages.DataStracture.Input;
import SourcePackages.DataStracture.InsertionSort;
import SourcePackages.DataStracture.Merge_Sort;
import SourcePackages.DataStracture.Quick_Sort;
import SourcePackages.DataStracture.RadixSort;
import SourcePackages.DataStracture.SelectionSort;
import SourcePackages.DataStracture.StackData;
import java.util.Scanner;

/**
 *
 * @author jahan
 */
public class DataStruc_Switch {

    boolean stmt = true;
    Scanner sc = new Scanner(System.in);

    public void dataStructureSwitch() {
        while (stmt) {
            System.out.println("""
                           
                                   ========== *Data Structure* ==========
                                            0. Exit
                                            1. Linear Search
                                            2. Binary Search
                                            3. Bubble Sort
                                            4. Insertion Sort
                                            5. Selection Sort
                                            6. Mearge Sort
                                            7. Quick Sort
                                            8. Counting Sort
                                            9. Radix Sort
                                           10. Bucket Sort
                                           11. Shell Sort
                                           12. Stack
                                           13. Queue
                                           14. Link List
                                           15. Heap Sort
                                           16. Binaey Search Tree
                                           17. Fibonacci Number
                                           18. Euclidean GCD Algorithm
                                           19. Universal Hasing
                                   ======================================
                                   """);
            System.out.print("Enter your Data Structure Choice: ");
            int n1 = sc.nextInt();

            switch (n1) {
                case 0: {
                    stmt = !stmt;
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    
                    break;
                }
                case 3: {
                    BubbleSort b = new BubbleSort();
                    Input i = new Input();
                    b.bubble_sort(i.sort_input_int());
                    break;
                }
                case 4: {
                    InsertionSort is = new InsertionSort();
                    Input in = new Input();
                    is.insertion_sort(in.sort_input_int());
                    break;
                }
                case 5: {
                    SelectionSort ss = new SelectionSort();
                    Input in = new Input();
                    ss.selection_sort(in.sort_input_int());
                    break;
                }
                case 6: {
                    Merge_Sort ms = new Merge_Sort();
                    ms.merge_sort();
                    break;
                }
                case 7: {
                    Quick_Sort qs = new Quick_Sort();
                    qs.quick_sort();
                    break;
                }
                case 8: {
                    break;
                }
                case 9: {
                    RadixSort rs = new RadixSort();
                    rs.radix_sort();
                    break;
                }
                case 10: {
                    BucketSort bSort = new BucketSort();
                    Input in = new Input();
                    bSort.bucket_sort(in.sort_input_float());
                    break;
                }
                case 11: {
                    break;
                }
                case 12: {
                    StackData stkData = new StackData();
                    stkData.stack_switch();
                    break;
                }
                case 13: {
                    QueueData queData = new QueueData();
                    queData.queue_switch();
                    break;
                }
                case 14: {
                    Linked_List linked = new Linked_List();
                    linked.linked_switch();
                    break;
                }
                case 15: {
                    break;
                }
                case 16: {
                    break;
                }
                case 17: {
                    Fibonacci fib = new Fibonacci();
                    fib.fibo();
                    break;
                }
                case 18: {
                    GCD gcd = new GCD();
                    gcd.gcd_value();
                    break;
                }
                case 19: {
                    break;
                }
                default:
                    break;
            }
        }
    }

}
