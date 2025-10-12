package ex_10_For_Loop;

import java.util.Scanner;

public class Task_Factorial_HR {
    public static void main(String[] args) {
        System.out.println("Enter the number to find its factorial");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt())
        {
            System.out.println("Please enter the correct whole number to find its factorial");
        }
        else {
            int n = scanner.nextInt();
            int fact = 1;
            if (n == 0) {
                fact = 1;
            }
            if (n < 0)
                System.out.println("Please Enter the correct whole number as negative number are not accepted");
            for (int i = 1; i <= n; i++) {
                fact = fact * i;

            }
            System.out.printf("The factorial of the given number is %d", fact);
        }

    }
}
