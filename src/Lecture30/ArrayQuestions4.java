package Lecture30;

import java.util.Arrays;

public class ArrayQuestions4 {


    // Question 1: Two Sum -> return the indexes of the elements
    static int[] twoSum(int arr[], int target){
        int n = arr.length;

        for (int i =0; i<n-1; i++){
            for (int j = i+1; j< n; j++){
                if (arr[i]+arr[j] == target){
                    int ans[] = {i,j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }  // T.C. -> O(n2), S.C. -> O(1)



    static void main() {


        // Question 1: Two Sum -> return the indexes of the elements
        int arr[] = {1,2,3,4,5,6};
        int ans[] = twoSum(arr, 10);
        System.out.println(Arrays.toString(ans));
    }
}
