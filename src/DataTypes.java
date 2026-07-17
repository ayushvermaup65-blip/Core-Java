void main() {

    //Numeric DT -  short, byte, int, long

    byte num1 = 100;
    IO.println(num1);
    short num2 = 500;
    IO.println(num2);
    int num3 = 50000;
    long num4 = 947347384;
    IO.println(num3);
    IO.println(num4);

    //floating DTs

    float num5 = 3.144446f;  // 6 decimal digits precision
    IO.println(num5);

    double num6 = 3.142434343437;
    IO.println(num6);

    // other - Char, Boolean
    boolean eligibleToVote = true;
    IO.println(eligibleToVote);

    char firstCharacter = 'a';
    IO.println("My first character is: " + (char) (firstCharacter + 2));
}
