package Oct_10th_Task;

import java.util.Scanner;

public class Max_Two_Numbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 number to find the maximum number");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter numbers only");
            return;
        }
            int a = scanner.nextInt();

        if(!scanner.hasNextInt()) {
            System.out.println("Please enter number format only");
            return;
        }
            int b = scanner.nextInt();
            int m = (a > b) ? a : b;
            System.out.printf("Maximum number is %d", m);



    }
}
