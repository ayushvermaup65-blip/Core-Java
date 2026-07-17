public class Methods {
    //declaration/definition
    static void print2KaTable(){
        for(int i=1; i<=10; i++){
            int ans = 2*i;
            System.out.println("2 * " + i + " = " + ans);
        }

    }

    static void printSum(int x, int y){
        System.out.println("Sum: " + (x+y));
    }

    static void printMultiplication(int x, int y){
        int ans = x*y;
        System.out.println("result: " + ans);
    }

     static int add(int p, int q){
        int sum = p+q;
        return sum;
    }

    static void main() {
//        System.out.println("hi");
//        print2KaTable(); //method call
//        System.out.println("bye");
//          printSum(3,5);
//          printMultiplication(5,10);
//          int Sum = add(3,4);
//        System.out.println("Sum: " + Sum);
    }
}
