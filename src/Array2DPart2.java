import java.util.Scanner;

public class Array2DPart2 {
    static void main() {
        //Question 1: Add Array elements
//        int arr[][] = {
//                {1,2,3},
//                {1,2,3}
//        };
//        int sum = 0;
//
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                sum += arr[i][j];
//            }
//        }
//        System.out.println("Total Sum is: " + sum);


        //Question 2: Multiply Array elements
//        int arr[][] = {
//                {1,2,3},
//                {1,2,3}
//        };
//        int mul = 1;
//
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                mul *= arr[i][j];
//            }
//        }
//        System.out.println("Total Multiplication is: " + mul);


        //Question 3: Find Max Array elements
//        int arr[][] = {
//                {1,2,3},
//                {21,20,35}
//        };
//        int max = arr[0][0];
//
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                if(max < arr[i][j]){
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println("Max Element is: " + max);


//        //Question 4: Find Min Array elements
//        int arr[][] = {
//                {116,26,31},
//                {21,20,35}
//        };
//        int min = arr[0][0];
//
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                if(min > arr[i][j]){
//                    min = arr[i][j];
//                }
//            }
//        }
//        System.out.println("Min Element is: " + min);



//        //Question 5: Sum of diagonal elements
//        int arr[][] = {
//                {116,26,31},
//                {21,20,35},
//                {3,4,5}
//        };
//            int sum = 0;
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                if(i == j){
//                    sum += arr[i][j];
//                }
//            }
//        }
//        System.out.println("Sum of dialgonal element is : " + sum);


        //Question 6: Search element in matrix
        int arr[][] = {
                {116,26,31},
                {21,20,35},
                {3,4,5}
        };
        int target = 35;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    System.out.println("The Target element is at row : " + i + " and column : " + j);
                }
            }
        }



//        int[][] arr = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        //Input
//        for(int i = 0; i<=arr.length-1; i++){
//            for(int j = 0; j<=arr[i].length-1; j++){
//                System.out.println("Provide value for row = " + i + " and column = " + j);
//                    arr[i][j] = sc.nextInt();
//            }
//        }
//        //print
//        for (int rowIndex = 0; rowIndex<=arr.length-1; rowIndex++){
//            for (int colIndex = 0; colIndex<=arr[rowIndex].length-1; colIndex++){
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }
    }
}
