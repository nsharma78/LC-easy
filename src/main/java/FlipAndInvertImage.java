/*
    Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

    To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

    Example 1:

    Input: [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]
    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
    Example 2:

    Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
    Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
    Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
    Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
    Notes:

    1 <= A.length = A[0].length <= 20
    0 <= A[i][j] <= 1
*/

package main.java;

import java.util.*;

public class FlipAndInvertImage {

    public static void main(String []args){
        /*int[][] A = {   {1,1,0,0},
                        {1,0,0,1},
                        {0,1,1,1},
                        {1,0,1,0}
                    };*/

        int[][] A = {   {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        System.out.println("Matrix before flipping\n");
        printMatrix(A, A.length, A[0].length);
        A = flipAndInvertImage(A);
        System.out.println("Matrix after flipping\n");
        printMatrix(A, A.length, A[0].length);

    }

    public static int[][] flipAndInvertImage(int[][] A) { // O(A.length) O(1)
        for (int i = 0; i < A.length; ++i){
            int a = 0, b = A.length - 1;
            while(a <= b){
                boolean doNotFlip = false;
                int tmp = A[i][a];
                A[i][a] = A[i][b];
                A[i][b] = tmp;

                if(A[i][a] == 0)
                    A[i][a] = 1;
                else
                    A[i][a] = 0;

                if(a == b) doNotFlip = true;

                if(!doNotFlip){
                    if(A[i][b] == 0)
                        A[i][b] = 1;
                    else
                        A[i][b] = 0;
                }
                a++;
                b--;
            }
        }
        return A;
    }

    public static void printMatrix(int [][] matrix, int row, int col) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++)
                if(matrix[i][j] < 10)
                    System.out.print(matrix[i][j] + "  ");
                else
                    System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}