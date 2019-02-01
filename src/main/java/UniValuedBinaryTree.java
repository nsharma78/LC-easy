/*
A binary tree is univalued if every node in the tree has the same value.

        Return true if and only if the given tree is univalued.



        Example 1:
           1
       1        1
    1    1    1    1
  1   1


        Input: [1,1,1,1,1,1,1,1,1]
        Output: true
        Example 2:
           2
       2        2
    5    2    2    2
  2   2


        Input: [2,2,2,5,2,2,2,2,2]
        Output: false


        Note:

        The number of nodes in the given tree will be in the range [1, 100].
*/

package main.java;
import java.util.*;

public class UniValuedBinaryTree {
    private static List<Integer> values = new ArrayList<>();

    public static void main(String []args){
        int[] arr1 = {1,1,1,1,1,1,1,1,1};
        int[] arr2 = {2,2,2,5,2,2,2,2,2};
        TreeUtils.Node root = TreeUtils.insertLevelOrder(arr1, null, 0);
        TreeUtils.printLevelOrder(root);
        System.out.println("IsUniValued: " + isUnivalTree(root));

        root = TreeUtils.insertLevelOrder(arr2, null, 0);
        TreeUtils.printLevelOrder(root);
        System.out.println("IsUniValued: " + isUnivalTree(root));
    }

    public static boolean isUnivalTree(TreeUtils.Node root) { // O(no. of nodes) O(no. of nodes)
        dfs(root);
        for (int v: values)
            if (v != values.get(0))
                return false;
        return true;
    }

    public static void dfs(TreeUtils.Node node) {
        if (node != null) {
            values.add(node.data);
            dfs(node.left);
            dfs(node.right);
        }
    }
}
