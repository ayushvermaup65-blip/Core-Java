package Lecture35;

public class InsertionSort {

    static void insertionSort(int arr[]){
        int n = arr.length;
    for(int i=1; i<n; i++){
        int curr = i;
        int prev = i-1;
        int currValue = arr[i];

        //shifting
        while(prev >= 0 && currValue < arr[prev]){
            arr[prev+1] = arr[prev];
            prev--;
        }
        // av hamare paas ek khali jagah aa chuki h
        // place the currentVlaue
        arr[prev+1] = currValue;
    }
    }   // T.C. -> O(n^2) and S.C. -> O(1)
    
    public static void main(String[] args) {
        int[] arr = {52, 4, 31, 2, -1};
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
