package oct_17th_Task;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to find it is leap or non-leap year");
        if (scanner.hasNextInt())
        {
            int year = scanner.nextInt();
            if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {

                System.out.printf("The %d is a Leap year", year);
            }
                else
                {
                System.out.printf("The %d is a not a leap year",year);
            }
        }
        else {
            System.out.println("Enter correct year please, given Input is invalid format");
        }

    }
}
