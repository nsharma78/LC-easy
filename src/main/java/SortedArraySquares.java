/*
    Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.



    Example 1:

    Input: [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Example 2:

    Input: [-7,-3,2,3,11]
    Output: [4,9,9,49,121]


    Note:

    1 <= A.length <= 10000
    -10000 <= A[i] <= 10000
    A is sorted in non-decreasing order.
*/

package main.java;

import java.util.Arrays;

public class SortedArraySquares{

    public static void main(String []args){
        int [] arr = {-7,-4,-1,2,5,8};
        int [] arr1 = {-7,-3,2,3,11};
        int [] arr2 = {-9,-6,2,3,14};
        System.out.println("Array of squares in increasing order for input array {-7,-4,-1,2,5,8} : " + Arrays.toString(sortedSquares(arr)) );
        System.out.println("Array of squares in increasing order for input array {-7,-3,2,3,11} : " + Arrays.toString(sortedSquares1(arr1)) );
        System.out.println("Array of squares in increasing order for input array {-9,-6,2,3,14} : " + Arrays.toString(sortedSquares2(arr2)) );
    }

    public static int[] sortedSquares(int[] A) { // O(NlogN), O(N)
        int[] result = new int[A.length];
        int i = 0;

        for (int a : A)
            result[i++] = a * a;

        Arrays.sort(result);
        return result;
    }

    public static int[] sortedSquares1(int[] A) { // O(NlogN), O(1)
        int i = 0;

        for (int a : A)
            A[i++] = a * a;

        Arrays.sort(A);
        return A;
    }

    public static int[] sortedSquares2(int[] A) { // O(N), O(N)
        int len = A.length;
        int[] result = new int[len];
        int i = 0, j = len - 1;
        for (int p = len - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
}
