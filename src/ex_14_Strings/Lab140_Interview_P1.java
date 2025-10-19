package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
        String s11 = "hello";
        // How many strings are there in String constant pool -2 (Hello is a single word it is pointing s1, s4 and s10

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // How many total strings now in this program -5 (new always creates a new string)
    }
}
