package Lecture27;

public class Homework {

    // Question 1: Swap Alternate Elements in an array
    static int[] swapAlternate(int []arr){
        int size = arr.length;
        for (int i = 0; i<size; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }  // T.C. -> O(n), S.C. -> O(1)



    // Question 2: Print Array Intersection element
    static void intersectionElements(int []arr1, int []arr2){
        int newArray[];
        for (int i = 0; i<arr1.length; i++){
            for (int j = 0; j<arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }  // T.C. -> O(n × m)(n = size of first array, m = size of second array)
       // S.C. -> O(1)



    // Question 3: Print Alternate Extreme elements of an array
    static void printAlternateExtreme(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (start == end) {
                System.out.print(arr[start] + " ");
            } else {
                System.out.print(arr[start] + " ");
                System.out.print(arr[end] + " ");
            }
            start++;
            end--;
        }
    }  // T.C. -> O(n), S.C. -> O(1)






    static void main() {

        // Question1: Swap Alternate Elements in an array
        int arr[] = {10,20,30,40,50,60};
        System.out.println("Array after swapping alternate elements: ");
        for (int num : swapAlternate(arr)){
            System.out.println(num + " ");
        }


        // Question 2: Print Array Intersection element
        int[] arrA = {1, 2, 3, 4, 5};
        int[] arrB = {3, 4, 5, 6, 7};

        System.out.print("Intersection Elements: ");
        intersectionElements(arrA, arrB);



        // Question 3: Print Alternate Extreme elements of an array
        int []arr3 = {1,2,3,4,5,6};
        System.out.println("Alternate Extreme Elements: ");
        printAlternateExtreme(arr3);
    }
}
