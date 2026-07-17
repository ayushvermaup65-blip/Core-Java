package Lecture27;

public class ArrayQuestions {

    // Question 1: Find the average of array elements
    static double getAverage(int[] arr){
        double sum = 0;
        for (int i: arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }  // T.C. -> O(n), S.C. -> O(1)


    // Question 2: Multiply each element of array by 10
    static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];
        for (int i=0; i<size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }  // T.C. -> O(n), S.C. -> O(n)


    // Question 3: Search for an element in an Array {Linear Search}
    static boolean searchElement(int [] arr, int target){

        int size = arr.length;
        for(int i=0; i<size; i++){
            if (arr[i] == target){
                return true;
            }
        }
        // agar pura array travel ho chuka hai
        // and ek baar bhi target nhi mila
        // iska matlab target nhi mila , target false
        return false;
    }  // T.C. -> O(n), S.C. -> O(1)


    // Question 4: Find the maximum element in an array
    static int maxElement(int []arr){
        int size = arr.length;
        int maxNum = 0;
        for (int i = 0; i<size; i++){
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }  // T.C. -> O(n), S.C. -> O(1)



    // Question 5: Return Sum of +ve and -ve numbers
    static int[] getPosNegSum(int []arr){
        int positiveSum = 0;
        int negativeSum = 0;
        int size = arr.length;
        for(int i =0; i<size; i++){
            if(arr[i] < 0){
                // num is negative
                negativeSum += arr[i];
            } else{
                // num is positive
                positiveSum += arr[i];
            }
        }
        int ans[] = {positiveSum, negativeSum};
        return ans;
    }  // T.C. -> O(n), S.C. -> O(1)



    // Question 6: Count the number of Zeroes and Ones
    static int[] countZeroesAndOnes(int []arr){
        int ones = 0;
        int zeroes = 0;
        int size = arr.length;
        for(int i =0; i<size; i++){
            if(arr[i] == 0){
                // num is negative
                zeroes++;
            } else{
                // num is positive
                ones++;
            }
        }
        int ans[] = {zeroes, ones};
        return ans;
    }  // T.C. -> O(n), S.C. -> O(1)



    // Question 7: Find first Unsorted Element in Array
    static int getUnsortedElement(int []arr){
        int size = arr.length;
        for (int i = 0; i<size; i++){
            if(arr[i+1] < arr[i]){
                return arr[i+1];
            }
        }
        // jis case me main loop se bahar ajaunga
        return -1;
    }  // T.C. -> O(n), S.C. -> O(1)











    static void main() {
        // Question 1: Find the average of array elements
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println("The average is: " + getAverage(arr));


        // Question 2: Multiply each element of array by 10
        int [] arr2 = {2,3,4,5,6,7};
        int [] ans = multiplyBy10(arr2);
        System.out.println("The new array is: ");
        for (int i: ans){
            System.out.println(i);
        }


        // Question 3: Search for an element in an Array {Linear Search}
        int [] arr3 = {1,6,3,7,5,3,4,6};
        int target = 55;
        boolean ans2 = searchElement(arr3, 89);
        System.out.println(ans2);


        // Question 4: Find the maximum element in an array
        int [] arr4 = {3,4,17,23,45,78};
        System.out.println(maxElement(arr4));


        // Question 5: Return Sum of +ve and -ve numbers
        int arr5[] = {2,4,6,-5,-4,-2};
        int ans1[] = getPosNegSum(arr5);
        System.out.println("Positive Sum: " + ans1[0]);
        System.out.println("Negative Sum: " + ans1[1]);


        // Question 6: Count the number of Zeroes and Ones
        int arr6[] = {1,0,0,1,1,1,0,0,0,0,0,0,1};
        int ans3[] = countZeroesAndOnes(arr6);
        System.out.println("Number of zeroes in the array: " + ans3[0]);
        System.out.println("Number of ones in the array: " + ans3[1]);


        // Question 7: Find first Unsorted Element in Array
        int arr7[] = {1,2,4,6,5,8,12};
        System.out.println("First Unsorted element of array is: " + getUnsortedElement(arr7));

    }
}
