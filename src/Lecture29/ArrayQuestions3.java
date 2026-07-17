package Lecture29;

public class ArrayQuestions3 {

    // Question 1: Sort a given Array of elements 0s and 1s
    // {1,1,0,1,0,0,1}
    static int[] sort0sAnd1s(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                //swap
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                // i ko aage le jao
                i++;
            }
            if (arr[j] == 1) {
                // j ko piche le jao
                j--;
            }
        }
        return arr;
    }  // T.C. -> O(n), S.C. -> O(1)



    // Question 2: Find the missing number from the array
    static int missingNumber(int[] arr){
        int xorSum = 0;
        // XOR with all the array elements
        for (int n: arr){
            xorSum = xorSum ^ n;
        }
        // XOR with all the element in the range
        int n = arr.length;
        for (int i=0; i<=n; i++){
            xorSum = xorSum ^ i;
        }
        // ans ajaega
        return xorSum;
    }  // T.C. -> O(n), S.C. -> O(1)



    //  Question 3: Find the unique element in an Array
    static int uniqueElement(int[] arr){
        int ans = 0;
        for (int n: arr){
            ans = ans ^ n;
        }
        return ans;
    }  // T.C. -> O(n), S.C. -> O(1)



    static void main() {


        // Question 1: Sort a given Array of elements 0s and 1s
        // {1,1,0,1,0,0,1}
    int arr[] = {1,0,0,1,0,1};
    int ans[] = sort0sAnd1s(arr);
    for (int num : ans){
        System.out.println(num + " ");
    }



    // Question 2: Find the missing number from the array
    int arr2[] = {0,1,2,5,4};
        System.out.println(missingNumber(arr2));



        //  Question 3: Find the unique element in an Array
        int arr3[] = {1,2,3,4,3,2,4};
        System.out.println(uniqueElement(arr3));
    }
}
