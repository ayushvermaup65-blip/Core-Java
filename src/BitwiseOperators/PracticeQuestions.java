package BitwiseOperators;

import java.util.Scanner;

public class PracticeQuestions {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5);
        System.out.println(3<<2);
        System.out.println(16>>2);

        //ques 1: check if a number is even using bitwise
        int a = 10;
        if ((a&1) == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }



        // Ques 2: Swap two number using XOR
        int b = 4;
        int c = 5;
        System.out.println("Before Swapping:");
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Swapping using XOR
        b = b ^ c;
        c = b ^ c;
        b = b ^ c;

        System.out.println("After Swapping:");
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        // Ques 3: Find unique element (all others appear twice)
        int [] arr = {12,15,16,12,16,24,15};
        int unique = 0;
        // finding the unique element using XOR
        for (int num : arr){
            unique = unique ^ num;
        }
        System.out.println("The unique element is: " + unique);


        // Ques 4: Remove last set bit(1) occuring
        int n = 8;
        System.out.println(n & (n-1));

        // Example: 5 -> 00000101 => 00000100 => 4
        //          8 -> 00001000 => 00000000 => 0


        // Ques 5: Get last set bit
        int m = 15;
        System.out.println(m & (-m));

        // Example: 10 -> 00001010 => 00000010 => 2
        //          15 -> 00001111 => 00000001 => 1
    }
}
