package main.java;

public class TreeUtils {

    public static void main(String []args){
        int[] arr = {1,1,1,1,1,1,1,1,1};
        //int[] arr = {1,1,1,1,1,2,1,3,1};
        Node root = insertLevelOrder(arr, null, 0);
        printLevelOrder(root);
    }

    // create tree level order
    public static Node insertLevelOrder(int[] arr, Node node, int arrPos) {

        Node root = null;
        if(arrPos < arr.length) {

            root = new Node(arr[arrPos]);
            node = root;

            node.left = insertLevelOrder(arr, node.left, 2 * arrPos + 1);
            node.right = insertLevelOrder(arr, node.right, 2 * arrPos + 2);
        }

        return root;
    }

    public static void printLevelOrder(Node root) {
        System.out.println("==========LevelOrder Tree View Start==========");
        System.out.println("           " + root.data);
        System.out.println("       " + root.left.data + "       " + root.right.data);
        System.out.println("    " + root.left.left.data + "    " + root.left.right.data + "   " + root.right.left.data + "    " + root.right.right.data);
        System.out.println("  " + root.left.left.left.data + "   " + root.left.left.right.data);
        System.out.println("==========LevelOrder Tree View End==========");
    }

    // Tree node
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
            left = right = null;
        }
    }
}
