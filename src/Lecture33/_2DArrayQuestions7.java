package Lecture33;

import java.util.ArrayList;
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


    static void main() {

        // Question 1: Print the Sum of Each Row in a 2D Array
        int [][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(rowSums(arr));


        // Question 2: Print the Sum of Each Column in a 2D Array
        int [][] arr2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(colSums(arr2));
    }
}
