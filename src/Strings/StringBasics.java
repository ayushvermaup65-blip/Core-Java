package Strings;

import java.util.Scanner;

public class StringBasics {
    static void main() {
//        String firstName = "Ayush";
//        String lastName =  new String("Verma");
//        System.out.println(firstName + " " + lastName);
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(1));
//        firstName = firstName.concat(lastName);
//        System.out.println(" " + firstName);

//        String name = "Rana"; // Rana
//        name[0] = "b";
//        name = "Bana"; // Bana

//          String name1 = "Ayush";
//          String name2 = "AyUsh";
//        System.out.println(name1.equalsIgnoreCase(name2));
//          if (name1 == name2){
//              System.out.println("both strings are equal");
//          }
//          else{
//              System.out.println("both strings are not equal");
//          }


        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the string content: ");
        String str = sc.nextLine();
        System.out.println("Value of nextLine() : " + str);


        System.out.println("Provide the string content: ");
        String str2 = sc.next();
        System.out.println("Value of next() : " + str2);



    }
}
