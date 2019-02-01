/*
    Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

        You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

        Example 1:

        Input:
        Tree 1                     Tree 2
         1                         2
        / \                       / \
       3   2                     1   3
      /                           \   \
     5                             4   7
        Output:
        Merged tree:
         3
        / \
      4    5
     / \    \
    5   4    7


        Note: The merging process must start from the root nodes of both trees.
*/

package main.java;

public class MergeBinaryTrees {

    public static void main(String []args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] arr = {1,1,1,1,1,2,1,3,1};
        TreeUtils.Node root1 = TreeUtils.insertLevelOrder(arr1, null, 0);
        TreeUtils.Node root2 = TreeUtils.insertLevelOrder(arr2, null, 0);
        TreeUtils.printLevelOrder(root1);
        TreeUtils.printLevelOrder(root2);

        TreeUtils.printLevelOrder(mergeTrees(root1, root2));
    }

    public static TreeUtils.Node mergeTrees(TreeUtils.Node root1, TreeUtils.Node root2){ // O(m = minimum number of tree nodes in either tree) O(m)
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        TreeUtils.Node root = new TreeUtils.Node(root1.data + root2.data);

        root.left = mergeTrees(root1.left, root1.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;
    }
}