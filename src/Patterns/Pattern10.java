package Patterns;

public class Pattern10 {
    static void main() {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            //Part 1
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            //Part 2
            if (row==1 || row==n) {
                for (int col=1; col<=2*row-1; col++) {
                    System.out.print("* ");
                }
            } else {
                //1*
                System.out.print("* ");
                //2r-3 space
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//                                 *
//                               *   *
//                             *       *
//                           *           *
//                         * * * * * * * * *
