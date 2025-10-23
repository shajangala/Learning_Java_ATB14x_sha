package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab150_String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to check whether it is Palindrome:");
        String user_input = scanner.next();
        String reverse_user_input = "";

        for (int i = user_input.length()-1; i>=0; i--)
        {
            reverse_user_input = reverse_user_input + user_input.charAt(i);
        }
        if (user_input.equals(reverse_user_input))
        {
            System.out.println("The given String is a Palindrome");
        }
        else
        {
            System.out.println("The given String is not a Palindrome");
        }
    }
}
