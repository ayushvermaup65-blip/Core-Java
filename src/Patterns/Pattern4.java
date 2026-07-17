package Patterns;

public class Pattern4 {
    static void main() {
         int n = 5;

         for(int row=1; row<=n; row++){
             for(int col=1; col<=n-row; col++){
                 System.out.print("  ");
             }
             for(int col=1; col<=n; col++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}
//                            * * * * *
//                          * * * * *
//                        * * * * *
//                      * * * * *
//                    * * * * *