package Lecture34;

import java.util.*;

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
    }  // T.C. -> O(n^2), S.C. -> O(1)



        // Question 2: Spiral Print of Matrix
        static List<Integer> spiralOrder(int[][] arr){
            int m = arr.length;
            int n = arr[0].length;
            List<Integer> result = new ArrayList<>();

            int startingRow = 0;
            int endingRow = m-1;
            int startingCol = 0;
            int endingCol = n-1;
            while(startingRow <= endingRow && startingCol <= endingCol){
                // row wise left to right -> startingRow print karni h, from startingCol to endingCol
                for(int col = startingCol; col<=endingCol; col++){
                    result.add(arr[startingRow][col]);
                }
                startingRow++;

                // col wise top to bottom -> endingCol print karni h, from startingRow to ending row
                for(int row = startingRow; row<=endingRow; row++){
                    result.add(arr[row][endingCol]);
                }
                endingCol--;

                // row wise right to left -> endingRow print karni h, from endingCol to startingCol
                // valid endingRow present h ya nahi
                if(startingRow <= endingRow){
                    for(int col = endingCol; col >= startingCol; col--){
                    result.add(arr[endingRow][col]);
                }
                endingRow--;
                }


                // col wise bottom to top -> startingCol print karni h, from endingRow to startingRow
                // valid startingCol present h ya nahi
                if(startingCol <= endingCol){
                    for(int row = endingRow; row>= startingRow; row--){
                    result.add(arr[row][startingCol]);
                }
                startingCol++;
                }
            }
            return result;
        }



    static void main() {



        // Question 1: Rotate Matrix by 90 degree
        int arr[][] = {{1,2,3},{6,7,8},{10,11,12}};
        int ans[][] = rotateMatrix(arr,3);
        System.out.println(Arrays.deepToString(ans));




        // Question 2: Spiral Print of Matrix
        int arr2[][] = {{1,2,3,4},{5,6,7,8}};
        List<Integer> result = spiralOrder(arr2);
        for(int nums: result){
            System.out.println(nums);
        }

    }
}
