import java.util.Scanner;

public class Arrays {
    static void main() {

//        int arr[] = new int [3];
//        int n = arr.length;
//        Scanner sc = new Scanner(System.in);
//        for (int i=0; i<n; i++){
//            System.out.println("Enter input for index: " + i);
//            arr[i] =sc.nextInt();
//        }
//
//        //prints
//        System.out.println("Your array contains: ");
//        for(int val: arr){
//            System.out.println(val);
//        }


//        //declaration
//        int arr[];
//        //allocation
//        arr = new int [5];
//        //initialization
//        int brr [] = {10,20,30};
//
//        int n = brr.length;
//       for (int index=0; index<=n-1; index++){
//           System.out.println(brr[index]);
//        }
//        //           OR
//        for(int val: brr){
//            System.out.println(val);
//        }

//        System.out.println("Value at 0 index: " + brr[0]);
//        System.out.println("Value at 1 index: " + brr[1]);
//        System.out.println("Value at 2 index: " + brr[2]);


        int arr[] = {3,2,-5,21,10};
//        int ans =1;
        int max = arr[0];
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max element is : " + max);
        int min = arr[0];
        for (int i=0; i<n; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min element is : " + min);


    }
}
