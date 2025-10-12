package test_Coding;
import java.util.Scanner;

public class Number_Classification {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in); //Taking input from user
        if(scanner.hasNextInt())
        {
            int i = scanner.nextInt(); //storing the user input
            if (i < Integer.MAX_VALUE) { //checking the edge case like if user enters the value greater than the max value of Integer variable
                if (i > 0) //Checking the number is postive
                    System.out.printf("%d is a positive number", i);
                if (i < 0) //Checking the number is negative
                    System.out.printf("%d is a Negative number", i);
                if (i == 0) //Checking the number is zero
                    System.out.printf("%d is a Zero", i);
            }
            else
            {
                // if the user input is out of range of the Integer min & max values then the following error message will print
                System.out.println("Entered number is Outbound");
            }
        }
        else
        {
            // if the user input is invalid like string value then the following error message will print
            System.out.println("Invalid input received please Enter the number only. Thank you!");
        }
    }
}
