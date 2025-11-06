package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args){
        //Left hand triangle pattern
        // n =3
        // *
        // * *
        // * * *
        // int n=3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to print a Left hand triangle in how many lines ");
        if (sc.hasNextInt()) {
         int n= sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Please enter a valid number to print the left hand triangle");
        }
    }
}
