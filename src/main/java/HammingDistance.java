/*
    The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

    Given two integers x and y, calculate the Hamming distance.

    Note:
    0 ≤ x, y < 231.

    Example:

    Input: x = 1, y = 4

    Output: 2

    Explanation:
    1   (0 0 0 1)
    4   (0 1 0 0)
           ↑   ↑

    The above arrows point to positions where the corresponding bits are different.
*/

package main.java;

import java.util.*;

public class HammingDistance {

    public static void main(String []args){
        System.out.println("Hamming distance between 3 and 1 is: " + hammingDistance(3,1));
        System.out.println("Hamming distance between 4 and 1 is: " + hammingDistance(4,1));
    }

    public static int hammingDistance(int x, int y) { // O(distance) O(1)
        int res = x ^ y;
        int count = 0;
        while(res != 0){
            count++;
            res = res & (res - 1);
        }
        return count;
    }
}