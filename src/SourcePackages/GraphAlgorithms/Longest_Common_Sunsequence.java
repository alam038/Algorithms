/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourcePackages.GraphAlgorithms;

/**
 *
 * @author jahan
 */
public class Longest_Common_Sunsequence {
    
    int lcs(char[] x, char[] y, int m, int n) {
        if(m==0 || n==0){
            return 0;
        }else if(x[m-1] == y[n-1]){
            return 1+lcs(x, y, m-1, n-1);
        }else{
            return max(lcs(x, y, m, n-1), lcs(x, y, m-1, n));
        }
    }
    
    int max(int a, int b){
        return (a > b) ? a : b;
    }
    
    public void longestCommonSubsequence() {
        Longest_Common_Sunsequence lcs = new Longest_Common_Sunsequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        //String s1 = "ACADB";
        //String s2 = "CBDA";
        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();
        
        int m = x.length;
        int n = y.length;
        
        System.out.println("1st String: "+s1);
        System.out.println("2nd String: "+s2);
        System.out.println("Length of Longest Common Subsequence (LCS) is "+lcs.lcs(x, y, m, n));
    }
}
