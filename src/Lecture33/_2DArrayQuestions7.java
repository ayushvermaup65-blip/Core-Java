package Lecture33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2DArrayQuestions7 {


    // Question 1: Print the Sum of Each Row in a 2D Array
    static List<Integer> rowSums(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        // Traversal
        for (int i = 0; i<m; i++) {
            // jaise hi main kisi nayi row me aaunga
            // vaise hi main sum=0 kardunga

            int sum = 0;
            for (int j = 0; j < n; j++) {
                int value = arr[i][j];
                sum = sum + value;
            }
            // jab main saare column ki values travel and add
            // kar chuka hounga , tab mere paas sum ki value aa jayegi
            result.add(sum);
        }
        return result;
    }  // T.C. -> O(m*n), S.C. -> O(n)



    // Question 2: Print the Sum of Each Column in a 2D Array
    static List<Integer> colSums(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for (int j = 0; j< n; j++){
            int sum = 0;

            for (int i = 0; i<m; i++){
                int value = arr[i][j];
                sum += value;
            }
            result.add(sum);
        }
        return result;
    }  // T.C. -> O(n*m), S.C. -> O(n)



    // Question 3: Wave Print A Matrix
    static List<Integer> wavePrintMatrix(int[][] arr, int m, int n){
        List<Integer> result = new ArrayList<>();

        // lets move column wise
        for (int col = 0; col<n; col++){
            // har ek column index ko check karo for even/odd
            if ((col & 1) == 1){
                // Odd
                //Bottom to top
                for (int row = m-1; row>=0; row--){
                    result.add(arr[row][col]);
                }
            }
            else{
                // Even
                //Bottom to top
                for (int row = 0; row<m; row++){
                    result.add(arr[row][col]);
                }
            }
        }
        return result;
    }  // T.C. -> O(n*m), S.C. -> O(n)



    // Question 4: Find Transpose of a Matrix
    static int[][] transpose(int[][] arr){
        if (arr == null || arr.length == 0){
            return new int[0][0];
        }
        // for original array
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        // for new array
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;
        int ans[][] = new int[newTotalRows][newTotalCols];

        // actual logic

        for (int i = 0; i<totalRows; i++){
            for (int j = 0; j<totalCols; j++){
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }


    static void main() {

        // Question 1: Print the Sum of Each Row in a 2D Array
        int [][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(rowSums(arr));


        // Question 2: Print the Sum of Each Column in a 2D Array
        int [][] arr2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(colSums(arr2));



        // Question 3: Wave Print A Matrix
        int [][] arr3 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(wavePrintMatrix(arr3,3,3));



        // Question 4: Find Transpose of a Matrix
        int arr4[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(arr4)));
    }
}
