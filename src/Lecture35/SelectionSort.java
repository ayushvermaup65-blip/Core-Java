package Lecture35;

public class SelectionSort {
    
    static int[] selectionSort(int[]arr){
        int n = arr.length;
        // outer loop for rounds
        for (int i = 0; i<n-1; i++){
            int minIndex = i;

            // inner loop -> comparison arr[j] and arr[minIndex]
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // jab mera comparison complete ho jayega
            // to main minIndex wali value ko correct position pr place kardunga
            // swap arr[i], arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }   // T.C. -> O(n^2) and S.C. -> O(1)


    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        // perform selection sort and print the result
        int[] sortedArr = selectionSort(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
