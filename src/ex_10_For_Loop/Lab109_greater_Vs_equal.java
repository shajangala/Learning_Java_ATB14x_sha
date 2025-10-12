package ex_10_For_Loop;

public class Lab109_greater_Vs_equal {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);      // starts from 0 to 10, 11
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);      // starts from 1 to 10, 10
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);     // starts from 0 to 9, 10
        }
    }
}
