package oct_17th_Task;

import java.util.Scanner;

public class Triangle_Validation_Sides {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 sides of a triangle:");
        if (scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if (scanner.hasNextInt())
            {
                int b = scanner.nextInt();
                if (scanner.hasNextInt())
                {
                    int c = scanner.nextInt();
                    if (a == b && b == c)
                    {
                        System.out.println("The triangle is Equilateral");
                    }
                    else if (a==b || b==c || a==c)
                    {
                        System.out.println("The triangle is Isosceles");
                    }
                    else {
                        System.out.println("The triangle is Scalene");
                    }
                }
                else
                {
                    System.out.println("Please enter measurement of third side correct format");
                }
            }
            else
            {
                System.out.println("Please enter measurement of second side correct format");
            }
        }
        else
        {
            System.out.println("Please enter measurement of first side correct format");
        }
    }
}
