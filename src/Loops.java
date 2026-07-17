import java.util.Scanner;

public class Loops {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //Print counting from 1 to n
//        System.out.print("Enter value of n: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            System.out.println(i);
//        }

        //Print counting form n to 1
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for( int i=n; i>=1; i--){
            System.out.println(i);
        }

    }
}
