package ex_04_Operators;

public class Lab049_All_Operators {
    public static void main(String[] args) {
        boolean b1 = true;
        int a = 10;
        int b = 20;
        System.out.println(a + b); //30
        System.out.println(a > b); //false
        System.out.println(a >= b); //false
        System.out.println(a == b); //false
        System.out.println(a != b); //true

        //Arithmetic operators - +,-,*,/,%

       //Compound Assignment Operators
       int age = 10;
       age += 10; // += -> age = age + 10 20
       age -= 10; // -= -> age = age - 10 10
       age /= 10; // /= -> age = age / 10 1
        System.out.println(age);

       // Optional to learn - Digital Electronics
       // Bitwise - Not important for Automation

        // ~ - Bitwise Not, >> - Right shift, << - left shift, ^ - XOR

    }
}
