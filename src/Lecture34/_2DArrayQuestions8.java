package Lecture34;

import java.util.Arrays;

public class _2DArrayQuestions8 {

    // Question 1: Rotate Matrix by 90 degree
    static int[][] rotateMatrix(int[][]arr , int n){
        // Step 1: Transpose of matrix -> ye code tab use karo jab current matrix ko
        // transpose karna ho

        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                // Swap arr[i][j] with arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Step 2: Reverse all rows of matrix
        // har row par jaunga
        // and use reverse kardunga

        for (int i = 0; i<n; i++){
            // ab main ek nayi row par aa chuka hu
            // ab reverse start kardo
            int startCol = 0;
            int endCol = n-1;

            while (startCol <= endCol){
                // swap arr[row][startCol], arr[row][endCol]
                int temp = arr[i][startCol];
                arr[i][startCol] = arr[i][endCol];
                arr[i][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
        return arr;
    }


    static void main() {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int ans[][] = rotateMatrix(arr,3);
        System.out.println(Arrays.deepToString(ans));
    }
}
