package Lecture28;
import java.util.*;

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




    // Question 2: Print Union of Array Elements
    public static void printUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // kyoki HashSet me koi bhi element duplicate store nhi hota hai
        // isliye ham dono set ke elements ko HashSet me daal denge
        // to uska union apne aap aa jayega
        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        for (int num : set) {
            System.out.print(num + " ");
        }
    }  // T.C. -> O(n+m), S.C. -> O(n+m)




    static void main() {

        // Question 1: Shift Array Elements by k Position
        int arr[] = {10,20,30,40,50};
        int[] ans = shiftByK(arr, 3);
        for (int num : ans){
            System.out.println(num);
        }



        // Question 2: Print Union of Array Elements
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {3,4,5,6,7,8};
        printUnion(arr1,arr2);
    }
}
