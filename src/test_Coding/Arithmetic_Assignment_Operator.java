package test_Coding;

public class Arithmetic_Assignment_Operator {
    public static void main(String[] args) {
        int i = 10,j = 5; //Assignment operator
        System.out.print("Addition: "+(i + j)); //addition
        System.out.print(" Subtraction: "+(i - j)); //subtraction
        System.out.print(" Multiplication: "+(i * j)); //multiplication
        System.out.print(" Division: "+(i / j)); //division
        System.out.println(" Modulus: "+(i % j)); //Modulus
        System.out.println("addition compound operator: "+(i += j)); // 10+5 i becomes 15
        System.out.println("Subtraction compound operator: "+(i -= j));//15-5 i becomes 10
        System.out.println("Multiplication compound operator: "+(i *= j));// 10*5 i becomes 50
        System.out.println("Division compound operator: "+(i /= j)); //50/5 i becomes 10
    }
}
