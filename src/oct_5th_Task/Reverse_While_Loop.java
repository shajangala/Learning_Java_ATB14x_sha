package oct_5th_Task;

import java.util.Scanner;

public class Reverse_While_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String user_input = scanner.next();
        String reverse_user_input = "";

        int i = user_input.length()-1;
        while (i>=0)
        {
            reverse_user_input = reverse_user_input + user_input.charAt(i);
            i--;
        }
        System.out.println(reverse_user_input);
    }
}
