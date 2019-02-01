/*
    A self-dividing number is a number that is divisible by every digit it contains.

    For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

    Also, a self-dividing number is not allowed to contain the digit zero.

    Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

    Example 1:

    Input:
    left = 1, right = 22
    Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
    Note:

    The boundaries of each input argument are 1 <= left <= right <= 10000.
*/

package main.java;

import java.util.*;

public class SelfDividingNumbers {

    public static void main(String []args){
        System.out.println("Self dividing numbers between 1 and 22 is: " + selfDividingNumbers(1,22).toString() );
        System.out.println("Self dividing numbers between 66 and 100 is: " + selfDividingNumbers(66,100).toString() );
        System.out.println("Self dividing numbers between 101 and 768 is: " + selfDividingNumbers(101,768).toString() );
    }

    public static List<Integer> selfDividingNumbers(int left, int right) { // O(right) O(right)
        List<Integer> list = new ArrayList<>(right);

        for(int i = left; i <= right; ++i){

            int temp = i;
            while(temp > 0){
                int rem = temp % 10;
                if(rem == 0) break;
                temp = temp / 10;
                if(i % rem != 0)
                    break;
                else {
                    if(temp == 0)
                        list.add(i);
                }
            }
        }
        return list;

    }
}
