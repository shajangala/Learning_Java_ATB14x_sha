package oct_4th_Task;

import java.util.Scanner;

public class Grade_Students {
    public static void main(String[] args) {

        Scanner marks= new Scanner(System.in);
        System.out.println("Enter the marks:");

        if (marks.hasNextInt())
        {
            int marks1 = marks.nextInt();
            if (marks1 >= 0 && marks1 <= 100) {
                if(marks1 >= 0 && marks1 <= 59)
                    System.out.println("Your grade is F, please focus on Studies");
                if (marks1 >=60 && marks1 <= 69)
                    System.out.println("Your grade is D, Study more to get good score");
                if (marks1 >=70 && marks1 <= 79)
                    System.out.println("Your grade is C, Study more to get good score");
                if (marks1 >=80 && marks1 <= 89)
                    System.out.println("Your grade is B, you are doing good and pay attention on Studies");
                if (marks1 >=90 && marks1 <= 100)
                    System.out.println("Your grade is A, Congratulations for the Grade");
            }
            else
            {
                System.out.println("Please enter the marks from 0 to 100 only, Thank you");
            }
        }
        else
        {
            System.out.println("Please enter the correct marks in integers only, Thank you");
        }
    }
}
