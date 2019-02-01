/*
    Let's call an array A a mountain if the following properties hold:

    A.length >= 3
    There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
    Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

    Example 1:

    Input: [0,1,0]
    Output: 1
    Example 2:

    Input: [0,2,1,0]
    Output: 1
    Note:

    3 <= A.length <= 10000
    0 <= A[i] <= 10^6
    A is a mountain, as defined above.
*/

package main.java;
import java.util.*;

public class PeakIndexInMountainArray {

    public static void main(String []args){
        int [] arr = {3,4,5,1};
        int [] arr1 = {0,2,1,0};
        int [] arr2 = {0,1,0};
        System.out.println("Peak index in: " + Arrays.toString(arr) + " " + peakIndexInMountainArray(arr) );
        System.out.println("Peak index in: " + Arrays.toString(arr1) + " " + peakIndexInMountainArray(arr1) );
        System.out.println("Peak index in: " + Arrays.toString(arr2) + " " + peakIndexInMountainArray(arr2) );
    }

    public static int peakIndexInMountainArray(int[] A) { // O(log(A.length)) O(1)
        int low = 0;
        int high = A.length -1;

        while (low <= high){
            int mid = low + (high -low)/2;
            if(A[mid] < A[mid + 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}
