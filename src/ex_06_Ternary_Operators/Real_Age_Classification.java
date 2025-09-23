package ex_06_Ternary_Operators;

public class Real_Age_Classification {
    public static void main(String[] args) {
        int age=10;
        String s=(age<18)?"minor":((age<60)?"adult":"senior citizen");
        System.out.println("The person is "+s);
    }
}
