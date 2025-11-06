package ex_16_Arrays;
import java.util.*;


public class Lab163_2D_Reverse_Right_Triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for a right angle triangle in how many lines");
        if (scanner.hasNextInt())
        {
            int n= scanner.nextInt();
            for(int i=n;i>=1; i--) //i=3 3>=1
            {

                for (int j=1; j<=i; j++) //j= 1 1<=3
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
        else {
            System.out.println("Please enter a number properly to print the right angle triangle");
        }

    }
}
