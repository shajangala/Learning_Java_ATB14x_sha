package Oct_10th_Task;
import java.util.*;

public class Number_positive_Negative {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number to know it is positive or negative number");

        if( scanner.hasNextInt() )
        {
            int n= scanner.nextInt();
            if (n>=0)
            {
                System.out.println("The given input is positive number");
            }
            if (n<0)
            {
                System.out.println("The given input is negative number");
            }
        }
        else
        {
            System.out.println("The entered input is either not in integers or out of range of Integers");
        }
    }
}
