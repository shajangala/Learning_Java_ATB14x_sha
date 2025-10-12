package test_Coding;

import java.util.Scanner;

public class Prime_Number_For_Loop {
    public static void main(String[] args) {
        System.out.println("Please enter the number to print prime numbers");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if(n<Integer.MAX_VALUE) {
                for (int i = 2;i <= n; i++)
                {
                    if((i%2 != 0) && (i%5 != 0) && (i%3 != 0))
                    {
                        System.out.print(i);
                    }
                }
            }
            else
            {
                System.out.println("Input received Outbound");
            }
        }
        else
        {
            System.out.println("please enter a valid input");
        }
    }
}
