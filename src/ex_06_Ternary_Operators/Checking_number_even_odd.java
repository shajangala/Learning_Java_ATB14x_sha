package ex_06_Ternary_Operators;

public class Checking_number_even_odd {
    public static void main(String[] args) {
        int number=23;
        String S=(number%2==0)?"even number.":"odd number.";
        System.out.println("The given number is "+S);
    }
}
