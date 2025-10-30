package Oct_10th_Task;

import java.util.Scanner;

public class Age_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age to check your eligible for voting:");
        if (scanner.hasNextInt())
        {
              int n=scanner.nextInt();
              if(n>=18)
                  System.out.println("You are eligible for voting");
              else if(n<0)
              {
                  System.out.println("Please enter correct age");
              }
              else
              {
                  System.out.println("You are not eligible for voting");
              }
        }
        else {
            System.out.println("Enter age in numbers only");
        }
    }
}
