package test_Coding;
import java.util.*;
public class Factorial_While {
    public static void main(String[] args) {
        System.out.println("Please a number to find its factorial");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt())
        {
            int n = scanner.nextInt();
            if(n >= 0 && n<Integer.MAX_VALUE)
            {

                int fact = 1;
                if (n == 0) {
                    fact = 1;
                }
                int i=1;
                while (n >= i)
                {
                    fact = fact * i;
                    i++;
                }
                System.out.printf("The %d! is %d",n,fact);
            }
            else {
                System.out.println("Received input is negative value, try again!");
            }
        }
        else {
            System.out.println("Invalid input try again!");
        }

    }
}
