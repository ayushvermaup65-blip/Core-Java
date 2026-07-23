package Lecture30;

import java.util.*;

public class ArrayQuestions4 {


    // Question 1: Two Sum -> return the indexes of the elements
    static int[] twoSum(int arr[], int target){
        int n = arr.length;

        for (int i =0; i<n-1; i++){
            for (int j = i+1; j< n; j++){
                if (arr[i] + arr[j] == target){
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



    // Question 3: Remove Duplicates from Sorted Array
    static int removeDuplicates(int[] arr){
        int i = 0;
        int j = 1;
        int n = arr.length;
        while(j< n){
            if (arr[i] == arr[j]){
                j++;
            }
            else{
                //no match
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }  // T.C. -> O(n), S.C. -> O(1)



    // Question 4: Find First Repeating Element
    static int findFirstRepeatingElement(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        // freq store
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(int i: arr){
            if(freq.get(i) > 1){
                return i;
            }
        }
        // agar koi bhi freq > 1 nhi hai
        return -1;
    }  // T.C. -> O(n), S.C. -> O(n)



    static void main() {


        // Question 1: Two Sum -> return the indexes of the elements
        int arr[] = {1,2,3,4,5,6};
        int ans[] = twoSum(arr, 10);
        System.out.println(Arrays.toString(ans));



        // Question 2: Three Sum -> retun elements those sum is 0
        int arr2[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr2));



        // Question 3: Remove Duplicates from Sorted Array
        int arr3[] = {1,2,2,2,2,3,3,4};
        System.out.println(removeDuplicates(arr3));


        // Question 4: Find First Repeating Element
        int arr4[] = {10,5,3,4,3,5,6};
        System.out.println(findFirstRepeatingElement(arr4));
    }
}
