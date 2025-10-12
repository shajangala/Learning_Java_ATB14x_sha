package test_Coding;
import java.util.*;
public class Factorial_While {
    public static void main(String[] args) {
        System.out.println("Please a number to find its factorial");
        Scanner scanner = new Scanner(System.in); //taking the user input
        if (scanner.hasNextInt()) //chceking the input is integer or not
        {
            int n = scanner.nextInt();
            if(n >= 0 && n<Integer.MAX_VALUE) //checking input is greater than equal to 0
            {

                int fact = 1;
                if (n == 0) { //if the input is 0 factorial is 1
                    fact = 1;
                }
                int i=1;
                while (n >= i) //finding the factorial of given number using while loop logic
                {
                    fact = fact * i;
                    i++;
                }
                System.out.printf("The %d! is %d",n,fact); //printing the factorial of the user input
            }
            else {
                //Error message for negative numbers
                System.out.println("Received input is negative value, try again!");
            }
        }
        else {
            // Error message for invalid input like out range of integer or string
            System.out.println("Invalid input try again!");
        }

    }
}
