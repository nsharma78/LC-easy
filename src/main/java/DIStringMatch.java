/*
    Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

    Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

    If S[i] == "I", then A[i] < A[i+1]
    If S[i] == "D", then A[i] > A[i+1]


    Example 1:

    Input: "IDID"
    Output: [0,4,1,3,2]
    Example 2:

    Input: "III"
    Output: [0,1,2,3]
    Example 3:

    Input: "DDI"
    Output: [3,2,0,1]


    Note:

    1 <= S.length <= 10000
    S only contains characters "I" or "D".
*/

package main.java;

import java.util.*;

public class DIStringMatch{

    public static void main(String []args){
        System.out.println("Permuation for IDID is: " + Arrays.toString(diStringMatch("IDID")) );
        System.out.println("Permuation for III is: " + Arrays.toString(diStringMatch("III")) );
        System.out.println("Permuation for DDI is: " + Arrays.toString(diStringMatch("DDI")) );
    }

    public static int[] diStringMatch(String S) { // O(S.length()) O(S.length())
        int len = S.length();
        int I = 0;
        int D = len;
        int[] res = new int[len + 1];

        for (int i = 0; i < len; ++i){
            if(S.charAt(i) == 'I')
                res[i] = I++;
            else
                res[i] = D--;
        }
        if(I == D)
            res[len] = I;
        return res;
    }
}
