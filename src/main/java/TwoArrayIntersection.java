/*
    Given two arrays, write a function to compute their intersection.

    Example 1:

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]
    Example 2:

    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [9,4]
    Note:

    Each element in the result must be unique.
    The result can be in any order.
*/

package main.java;

import java.util.*;

public class TwoArrayIntersection{

    public static void main(String []args){
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};


        System.out.println("Intersection of arr1 and arr2 is: " + Arrays.toString(intersection(arr1, arr2)) );
    }

    public static int[] intersection(int[] nums1, int[] nums2) { // O(nums1.length + nums2.length + intersection.length) O(set.size() + list.size() + intersection.size()
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums1)
            set.add(i);

        for(int i : nums2){
            if(set.remove(i))
                list.add(i);
        }

        int[] intersection = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            intersection[i] = list.get(i);

        return intersection;
    }
}
