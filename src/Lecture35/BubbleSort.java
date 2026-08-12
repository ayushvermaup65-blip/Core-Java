package Lecture35;

public class BubbleSort {
    
    // Bubble Sort me sabse maximum value apni original position pe chali jati hai.
    static int[] bubbleSort(int[]arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        return arr;
    }  // T.C. -> O(n^2) and S.C. -> O(1)


     public static void main(String[] args) {
        int[] arr = {5, 9, 3, 12, 1};
        int[] sortedArr = bubbleSort(arr);
        for(int i = 0; i<sortedArr.length; i++){
            System.out.print(sortedArr[i] + " ");
        }

    }
}

