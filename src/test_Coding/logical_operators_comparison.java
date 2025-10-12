package test_Coding;

public class logical_operators_comparison {
    public static void main(String[] args) {
        int a = 10, b = 5;
        // Comparison Operators
        boolean c;
        c = (a == b); //comparison
        System.out.printf("a == b: %b ",c).println();
        c = (a > b); //comparison
        System.out.printf(" a > b: %b ",c).println();
        c = (a < b); //comparison
        System.out.printf(" a < b: %b ",c).println();
        c = ((a > b) && (a > 0)); //logical AND operator true && true = true
        System.out.printf(" (a > b) && (a > 0): %b ",c).println();
        c = ((a < b) || (a > 0)); //logical OR operator false || true = true
        System.out.printf(" (a < b) || (a > 0): %b ",c).println();
        c = (!(a > b)); //logical Not operator !(true)= false
        System.out.printf(" !(a > b): %b ",c).println();
    }
}
