package Patterns;

public class Pattern5 {
    static void main() {
        int n =5;
        for(int row=1; row<=n;row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

                        //OR

//        for(int row=1; row<=n; row++){
//            for(int col=5; col>=row; col--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
//                    * * * * *
//                    * * * *
//                    * * *
//                    * *
//                    *
