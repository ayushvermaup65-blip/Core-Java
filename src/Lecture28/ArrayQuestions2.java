package Lecture28;

import JavaCollectionFramework.Map.HashMapDemo;

import java.util.HashMap;

public class ArrayQuestions2 {

    //Question 1: Find the reverse of array
//    static int[] reverseArray(int[] arr) {
//        int size = arr.length;
//        int start = 0;
//        int end = size - 1;
//
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        return arr;
//    }  // T.C. -> O(n), S.C. -> O(1)



//    // Question 2: Shift array elements by 1 position
//    static void shiftBy1(int []arr){
//        int size = arr.length;
//
//        // last element to temp me store karo
//        int temp = arr[size-1];
//
//        //value ko 1 place aage shift karo
//        for (int i = size-1; i>0; i--){
//            arr[i] = arr[i-1];
//        }
//
//        // temp ko 0 index pe rakh do
//        arr[0] = temp;
//    }  // T.C. -> O(n), S.C. -> O(1)



    // Question 3: Find the Mode of the array
//    static int getMode(int arr[]){
//        HashMap<Integer, Integer> freq = new HashMap<>();
//        for (int num : arr){
//            freq.put(num, freq.getOrDefault(num, 0) + 1);
//        }
//
//        // Niche code likha hai -> har element ki frequency show karne ke liye, but ye compulsary nhi hai.
////        for (int i : freq.keySet()){
////            // i -> will represent key
////            System.out.println(i + " -> " + freq.get(i));
////        }
//
//        int maxFreq = -1;
//        int maxFreqWaliKey = -1;
//
//        for (int key : freq.keySet()){
//            int currentKey = key;
//            int currentKeyKiFrequency = freq.get(key);
//            if (currentKeyKiFrequency > maxFreq){
//                // mujhe naya max mil gya
//                maxFreq = currentKeyKiFrequency;
//                maxFreqWaliKey = currentKey;
//            }
//        }
//        // jab loop se bahar aaoge to max freq wali key ready hai
//        return maxFreqWaliKey;
//    }  // T.C. -> O(n), S.C. -> O(n)



    // Question 4: Identify elements with Highest and Lowest Frequency
    static int[] getHighestLowestFreqElement(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        // insert data
        for (int num: arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        //hashmap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq){
                // highest ko update krna chahiye
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq){
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }  // T.C. -> O(n), S.C. -> O(n)






    static void main(String[] args) {


        //Question 1: Find the reverse of array
//        int arr[] = {1,2,3,4,5};
//        int[] ans = reverseArray(arr);
//        for (int num : arr){
//            System.out.println(num);
//        }



        // Question 2: Shift array elements by 1 position
//        int arr2[] = {1,2,3,4,5};
//        shiftBy1(arr2);
//        for (int a: arr2){
//            System.out.println(a + " ");
//        }
//        System.out.println();



        // Question 3: Find the Mode of the array
//        int arr3[] = {1,2,2,3,3,3,4,4,5,5,5,5,5,5};
//         int ans3 = getMode(arr3);
//        System.out.println(ans3);



        // Question 4: Identify elements with Highest and Lowest Frequency
        int arr4[] = {1,2,2,3,3,3,4,4,5,5,5,5,5,5};
        int ans[] = getHighestLowestFreqElement(arr4);
        System.out.println("Highest freq wala num: " + ans[0]);
        System.out.println("Lowest freq wala num: " + ans[1]);
    }
}
