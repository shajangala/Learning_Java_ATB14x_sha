package ex_16_Arrays;

import java.util.Scanner;

public class LeftAngleTriangle {
    public static void main(String[] args)
    {
      /*  int n=3;
        for (int i=0; i<n; i++)
        {
            for (int j=i; j< n-1; j++)
            {
                System.out.print(" "); // (0,0) (0,1) (0,2)
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print("*"); // (0,0)
            }
            System.out.println();
        }
        */
        Scanner scanner= new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        String s = scanner.nextLine();

        System.out.printf("String: %s",s).println();
        System.out.printf("Double: %f",d).println();
        System.out.printf("Int: %d",i).println();;

        scanner.close();
    }
}
