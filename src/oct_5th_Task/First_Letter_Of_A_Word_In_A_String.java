package oct_5th_Task;

import java.util.Scanner;

public class First_Letter_Of_A_Word_In_A_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to find the first letter of your words");
        String user_input = scanner.nextLine();

        String[] arr = user_input.split("\\s+");
        for (int i=0; i<arr.length; i++)
        {
            if(!arr[i].isEmpty())
            {
                System.out.print(arr[i].charAt(0));
            }
        }

    }
}
