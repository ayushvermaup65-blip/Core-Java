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
    }



    static void main() {


        // Question 1: Sort a given Array of elements 0s and 1s
        // {1,1,0,1,0,0,1}
    int arr[] = {1,0,0,1,0,1};
    int ans[] = sort0sAnd1s(arr);
    for (int num : ans){
        System.out.println(num + " ");
    }
    }
}
