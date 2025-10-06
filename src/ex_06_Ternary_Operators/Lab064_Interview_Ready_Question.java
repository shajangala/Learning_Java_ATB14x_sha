package ex_06_Ternary_Operators;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        int age = 21;
        String result = (age > 18) ? (age > 25 ? "Yes, you can drink" : "you can Go to GOA! but you can't drink") : "No" ;
        System.out.println(result);
    }
}
