package Strings;

public class StringQuestions {

    // Question 1: Print each character of the String
//    static void printString(String str){
//        int n = str.length();
//        for (int i = 0; i<n; i++){
//            char ch = str.charAt(i);
//            System.out.println(ch);
//        }
//    }

    // Question 2: Count length of String without using length()
//    static int getLengthOfString(String str){
//       char[] arr = str.toCharArray();
//       int len = arr.length;
//       return len;
//    }

    // Question 3: Count vowels in a String
//    static int countVowels(String str){
//        int count = 0;
//        for (int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//                  if(ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
//                    ch== 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//                count++;
//            }
//        }
//        return count;
//    }

    // Question 4: Reverse a String
    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    // Question 5: Check String is a palindrome or not
    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);
        //compare

        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }




    static void main() {
        String str1 = "Ayush";
//      printString(str1); // A y u s h
//        System.out.println(getLengthOfString(str1)); // 5
        String str2 = "My name is Ayush Verma";
//        System.out.println(countVowels(str2)); // 7
//        System.out.println(reverseString(str1)); // hsuyA
        String str3 = "racecar";
        System.out.println(isPalindrome(str3));


    }
}
