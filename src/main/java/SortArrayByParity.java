/*
    Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

    You may return any answer array that satisfies this condition.



    Example 1:

    Input: [3,1,2,4]
    Output: [2,4,3,1]
    The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


    Note:

    1 <= A.length <= 5000
    0 <= A[i] <= 5000
*/

package main.java;

import java.util.*;

public class SortArrayByParity {

    public static void main(String []args){
        int[] A = {3,1,2,4,5,6};

        System.out.println("Array: " +  Arrays.toString(A) + " sorted by parity: " + Arrays.toString(sortArrayByParity(A)) );
    }

    public static int[] sortArrayByParity(int[] A) { // O(A.length) O(1)

        int firstOdd = 0;
        for (int i = 0; i < A.length; ++i){
            if(A[i] % 2 == 0){
                int tmp = A[i];
                A[i] = A[firstOdd];
                A[firstOdd] = tmp;
                firstOdd++;
            }
        }
        return A;
    }
}
