package Lecture32;

import com.sun.jdi.Value;

public class ArrayQuestions6 {

    // Question 1: Maximum Subarray -> Kadane's Algorithm
    // Given an integer array nums, find the subarray with the largest sum, and return its sum.

    // Is question ka matlab hai ki given array ki sabhi subarrays ko nikalo aur sabhi subarrays ka individul sum karo, ab jis bhi subarray ke sum ki value sabse jyada hai us value ko print kardo.

    static int maxSubArray(int arr[]){
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i< n; i++){
            // Step 1: Sum create karte hai
            sum = sum + arr[i];

            // Step 2: maxSum update karte hai
            if (maxSum < sum){
                maxSum = sum;
            }

            // Step 3: Sum check karte hai for -ve value
            if (sum < 0){
                sum = 0;
            }

        }
            return maxSum;
    }



    static void main(String[] args) {
        int arr1[] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr2[] = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr1));
        System.out.println(maxSubArray(arr2));
    }
}
