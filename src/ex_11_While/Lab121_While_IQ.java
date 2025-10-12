package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        System.out.println("Enter a number to find its factorial");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt())
            System.out.println("Please Enter Integer only to find the factorial");
        else
        {
            int n = scanner.nextInt();
            int fact = 1;
            if (n == 0)
                fact = 1;
            if (n < 0 || n > Integer.MAX_VALUE)
                System.out.println("System can't calculate factorial for the given number it is either negative number or Out of bound");
        while(n>=1)
        {
            fact = fact * n;
            n--;
        }
        System.out.printf("The factorial of the given number is %d",fact);
        }
    }
}
