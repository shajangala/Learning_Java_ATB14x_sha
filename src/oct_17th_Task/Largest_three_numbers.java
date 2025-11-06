package oct_17th_Task;
import java.util.*;

public class Largest_three_numbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers to find the largest number among them");

        if(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    int c = scanner.nextInt();
                    int l = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
                    System.out.printf("The largest number among all the given numbers is %d.", l);
                }
                else {
                    System.out.println("Please ensure that second number is in valid format");
                }
            }
            else
            {
                System.out.println("Please ensure that second number is in valid format");
            }
        }
        else
        {
            System.out.println("Please ensure that first number is in valid format");
        }
    }
}
