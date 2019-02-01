/*
    In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

    Return the element repeated N times.



    Example 1:

    Input: [1,2,3,3]
    Output: 3
    Example 2:

    Input: [2,1,2,5,3,2]
    Output: 2
    Example 3:

    Input: [5,1,5,2,5,3,5,4]
    Output: 5
*/

package main.java;

import java.util.*;

public class RepeatedNTimes {

    public static void main(String []args){
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {2,1,2,5,3,2};
        int [] arr3 = {5,1,5,2,5,3,5,4};

        System.out.println("Repeated elements in {1,2,3,4}: " +  repeatedNTimes(arr1));
        System.out.println("Repeated elements in {2,1,2,5,3,2}: " +  repeatedNTimes(arr2));
        System.out.println("Repeated elements in {5,1,5,2,5,3,5,4}: " +  repeatedNTimes(arr3));
    }

    public static int repeatedNTimes(int[] A) { // O(A.length/2 + 1) O(A.length/2 - 1)
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i <= (A.length/2 + 1); ++i){
            if(!set.add(A[i]))
                return A[i];
        }
        return -1;
    }
}