package oct_17th_Task;

import java.util.Scanner;

public class Smallest_Two_Numbers {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 2 numbers to find its smallest number");
        if (scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if (scanner.hasNextInt())
            {
                int b = scanner.nextInt();
                int s = (a>b)?b :a;
                System.out.printf("The Smallest number of the given input is %d.",s);
            }
            else {
                System.out.println("Please enter the second number in the correct format");
            }
        }
        else {
            System.out.println("Please enter the first number in a valid format");
        }
    }
}
