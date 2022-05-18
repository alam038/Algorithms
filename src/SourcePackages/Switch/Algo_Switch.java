/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.Switch;

import SourcePackages.GraphAlgorithms.BFS;
import SourcePackages.GraphAlgorithms.DFS;
import SourcePackages.GraphAlgorithms.Dijkstra;
import SourcePackages.GraphAlgorithms.GraphRepresent;
import SourcePackages.GraphAlgorithms.Knapsack;
import SourcePackages.GraphAlgorithms.Longest_Common_Sunsequence;
import SourcePackages.GraphAlgorithms.MatrixChainMultiplication;
import SourcePackages.GraphAlgorithms.Prims;
import java.util.Scanner;

/**
 *
 * @author jahan
 */
public class Algo_Switch {

    boolean stmt = true;
    Scanner sc = new Scanner(System.in);

    public void Algorithm_Switch() {
        while (stmt) {
            System.out.println("""
                               
                                   ===========*  Algorithm  *============
                                            0. Exit
                                            1. Graph Representation
                                            2. BFS
                                            3. DFS
                                            4. Topological Sort
                                            5. Krushkal
                                            6. Prim's
                                            7. Dijkastra
                                            8. Bellman
                                            9. Floyed-Warshall
                                            10. KnapSack
                                            11. Graph Representation
                                            12. Matrix Chain Multiplication
                                            13. Longest Common Subsequence
                                   ======================================
                                   """);
            System.out.print("Type your Algoritm choice: ");
            int n2 = sc.nextInt();

            switch (n2) {
                case 0: {
                    stmt = false;
                    break;
                }
                case 1: {
                    GraphRepresent gr = new GraphRepresent();
                    gr.graph_representation();
                    break;
                }
                case 2: {
                    BFS bfs = new BFS(4);
                    bfs.display_bfs();
                    break;
                }
                case 3: {
                    DFS dfs = new DFS(4);
                    dfs.dfs();
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    Prims prims = new Prims();
                    prims.prims_algorithm();
                    break;
                }
                case 7: {
                    Dijkstra djs = new Dijkstra();
                    djs.dijstra();
                    break;
                }
                case 8: {
                    break;
                }
                case 9: {
                    break;
                }
                case 10: {
                    Knapsack kps = new Knapsack();
                    kps.knapsack_algorithm();
                    break;
                }
                case 11: {
                    GraphRepresent gr = new GraphRepresent();
                    gr.graph_representation();
                    break;
                }
                case 12: {
                    MatrixChainMultiplication mcm = new MatrixChainMultiplication();
                    mcm.matrixChainMultiplication();
                    break;
                }
                case 13: {
                    Longest_Common_Sunsequence lcs = new Longest_Common_Sunsequence();
                    lcs.longestCommonSubsequence();
                    break;
                }
                default:
                    break;
            }
        }
    }
}
