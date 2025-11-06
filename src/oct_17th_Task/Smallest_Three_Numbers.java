package oct_17th_Task;
import java.util.Scanner;

public class Smallest_Three_Numbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find it's smallest number");
        if (scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if (scanner.hasNextInt())
            {
                int b = scanner.nextInt();
                if (scanner.hasNextInt())
                {
                    int c = scanner.nextInt();
                    int s = (a<b)? ((a<c)?a:c):((b<c)?b:c);
                    System.out.printf("The smallest number among all the numbers %d",s);
                }
                else {
                    System.out.println("Enter the correct number either it is in incorrect format or Out of range");
                }
            }
            else
            {
                System.out.println("Enter the correct number either it is in incorrect format or Out of range");
            }
        }
        else
        {
            System.out.println("Enter the correct number either it is in incorrect format or Out of range");
        }
    }
}
