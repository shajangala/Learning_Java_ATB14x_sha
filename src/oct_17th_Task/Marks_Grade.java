package oct_17th_Task;

import java.util.Scanner;

public class Marks_Grade {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks(0-100):");
        if (scanner.hasNextInt()) {
            int marks = scanner.nextInt();
            if (marks > 0 && marks <= 100) {

                if (marks >= 90 && marks <= 100)
                    System.out.println("You scored A+ grade");
                else if (marks >= 80 && marks <= 89) {
                    System.out.println("You scored A grade");
                } else if (marks >= 70 && marks <= 79) {
                    System.out.println("You scored B grade");
                } else if (marks >= 60 && marks <= 69) {
                    System.out.println("You scored C grade");
                } else if (marks >= 50 && marks <= 59) {
                    System.out.println("You scored D grade");
                } else if (marks >= 40 && marks <= 49) {
                    System.out.println("You scored A grade");
                } else {
                    System.out.println("You are fail,Try again!");
                }
            }
            else
            {
                System.out.println("Please enter the marks from 0 to 100 only");
            }
        }
        else
            System.out.println("Enter the marks are incorrect format,please enter from 0 to 100");

    }
}
