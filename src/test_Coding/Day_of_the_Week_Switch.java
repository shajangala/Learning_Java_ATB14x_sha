package test_Coding;

import java.util.Scanner;

public class Day_of_the_Week_Switch {
    public static void main(String[] args) {
        System.out.println("Please enter a number from 1-7:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt())
        {
            int i = scanner.nextInt();
            switch (i)
            {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid week day received, please select the number from 1-7");
            }
        }
        else
        {
            System.out.println("Please enter a valid input from 1-7 only. Thank you");
        }
    }
}
