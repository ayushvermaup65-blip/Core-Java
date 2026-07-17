package Lecture28;

public class Homework2 {

    // Question 1: Shift Array Elements by k Position
    static int[] shiftByK(int[] arr, int k){
        int size = arr.length;

        //Handle cases where k > n
        k = k % size;

        int[] temp = new int[size];

        for (int i = 0; i < size; i++){
            temp[(i + k) % size] = arr[i];
        }

        // Copy back to original array
        for(int i = 0; i < size; i++){
            arr[i] = temp[i];
        }
        return arr;
    }  // T.C. -> O(n), S.C. -> O(n)





    static void main() {

        // Question 1: Shift Array Elements by k Position
        int arr[] = {10,20,30,40,50};
        int[] ans = shiftByK(arr, 3);
        for (int num : ans){
            System.out.println(num);
        }
    }
}
