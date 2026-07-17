public class Methods_HW {

    // HomeWork 1: Create a method printWelcomeMessage() that prints a greeting.
    static void printWelcomeMessage(){
        System.out.println("Welcome Everybody !");
    }

    // HomeWork 2: Create a method ADD(int a , int b) that returns the sum.
    static int ADD(int a, int b){
        int ans = a+b;
        return ans;
    }

    //HomeWork 3: Create a method isEven(int number) that returns true if number is even.
    static boolean isEven(int number){
        if(number % 10 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    // HomeWork 4: Create a method getMaximum(int a, int b) that returns the larger number.
    static int getMaximum(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    //HomeWork 5: Create a method calculatePercentage(int obtained, int total).
    static float calculatePercentage(float obtained, float total){
        float percentage = (obtained*100)/total;
        return percentage;
    }

    static void main() {
        printWelcomeMessage();

        int ans = ADD(5,5);
        System.out.println("Sum = " + ans);

        boolean a = isEven(10);
        System.out.println("Number is : " + a);

        int larger = getMaximum(30,10);
        System.out.println("Largest number is : " + larger);

        float percentage = calculatePercentage(419f, 600f);
        System.out.println("Percentage is : " + percentage + "%");
        }
}
