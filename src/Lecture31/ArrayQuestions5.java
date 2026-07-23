package Lecture31;

import java.util.*;
public class ArrayQuestions5 {


    // Question 1: Missing Element From an Array with Duplicates
    static List<Integer> findDisappearedNumbers(int[] arr){
        List<Integer> ans = new ArrayList<>();
        // Marking
        int n = arr.length;
        for(int index= 0; index < n; index++){
            int value = Math.abs(arr[index]);
            int position = value - 1;

            // Mark kardo ye position
            if (arr[position] > 0){
                arr[position] = -arr[position];
            }
        }
        // Travel array and whenever you encounter a positive value, print the nuber at the same time
        for (int i = 0; i< n ; i++){
            if(arr[i] > 0){
                int valueAtThisIndex = i+1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }  // T.C. -> O(n), S.C. -> O(n)


    static void main() {


        // Question 1: Missing Element From an Array with Duplicates
        int arr1[] = {1,2,2,4,3,6,4};
        System.out.println(findDisappearedNumbers(arr1));
    }



}
