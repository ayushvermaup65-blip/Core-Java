package Lecture30;

import java.util.*;

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



    // Question 2: Three Sum -> retun elements those sum is 0
    static List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }  // T.C. -> O(n2), S.C. -> O(1)



    static void main() {


        // Question 1: Two Sum -> return the indexes of the elements
        int arr[] = {1,2,3,4,5,6};
        int ans[] = twoSum(arr, 10);
        System.out.println(Arrays.toString(ans));



        // Question 2: Three Sum -> retun elements those sum is 0
        int arr2[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr2));
    }
}
