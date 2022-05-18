/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.GraphAlgorithms;

/**
 *
 * @author jahan
 */
public class NaiveStringMatching {

    public static void search(String txt, String pat) {
        int M = pat.length();
        int N = txt.length();
        System.out.println("M"+M);
        System.out.println("N"+N);

        for (int i = 0; i <= N - M; i++) {
            int j;

            for (j =  0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
                if (j == M-1) {
                    System.out.println("Pattern Found at index " + i);
                }
            }
        }
    }

    public static void main(String[] args) {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        System.out.println("1st String: "+txt);
        System.out.println("2st String: "+pat+"\n");
        search(txt, pat);
    }

}
