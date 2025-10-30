package oct_10th_Task;
import java.util.*;

public class Number_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to known even or odd");
        if(scanner.hasNextInt())
        {
            int n = scanner.nextInt();


                if(n%2 == 0)
                {
                    System.out.println("Even number");
                }
                else
                {
                    System.out.println("Odd number");
                }


        }
        else
        {
            System.out.println("The given Input is invalid format,please enter numbers only");
        }

    }
}
