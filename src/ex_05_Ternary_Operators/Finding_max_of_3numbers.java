package ex_05_Ternary_Operators;

public class Finding_max_of_3numbers {
    public static void main(String[] args) {
        int n1=2,n2=9,n3=-11;
        int result=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("The greatest number among the 3 given numbers is "+result);
    }
}
