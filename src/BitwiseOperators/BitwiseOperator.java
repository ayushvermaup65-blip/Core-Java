package BitwiseOperators;

public class BitwiseOperator {
    static void main() {

        int a = 5;
        int b = 6;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~a);
//        System.out.println(~b);
//        System.out.println(a<<3);
//        System.out.println(b>>2);
//        System.out.println(6<<3);

//        for(int i=1; i<=34; i++){
//            a = a << 1;
//            System.out.println(a);
//            System.out.println();
//        }
//        int n = 100;
//        for (int i=1; i<=10; i++){
//            n = n>>1;
//            System.out.println(n);
//            System.out.println();
//        }

        // Using Bitwise AND & to find if a number is even or odd
        int n = 11;
        if ((n & 1 ) == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }



        // Using Bitwise AND to check if a number is power of 2 or not
        // jis bhi number ke bit form me bit-> 1 sirf ek baar aata hai sirf vahi number hi 2 ki power wali number hai.
//        int n = 10;
//        if ((n & (n-1)) == 0) {
//            System.out.println(n + " is power of 2");
//        }
//        else{
//            System.out.println(n + " is not power of 2");
//        }
                //  OR  //
//        int n = 7;
//        int count = 0;
//        while (n != 0){
//            if ((n&1) != 0){
//                // mujhe ek set bit milgyi
//                count++;
//            }
//            // right shift to remove this bit
//            n = n>>1;
//        }
//        System.out.println("Set bit Count: " + count);

    }
}
