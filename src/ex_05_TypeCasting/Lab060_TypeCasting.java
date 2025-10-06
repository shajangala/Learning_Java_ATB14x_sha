package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 89774745;
        // short s = phone_no // Narrowing -> Implicit
        short s = (short) phone_no; //Narrowing -> Explicit
        System.out.println(s);
    }
}
