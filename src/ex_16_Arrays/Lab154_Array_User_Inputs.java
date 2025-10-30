package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array[integers only]:");
        int size = scanner.nextInt();
        String[] number_marks = new String[size];

        for (int i = 0; i<number_marks.length; i++)
        {
            System.out.println("Enter the elements of the array "+ i);
            number_marks[i] = scanner.next();
        }
        System.out.println("The user input is");
        for(String mark: number_marks)
        {
            System.out.print(mark+"\t");
        }
    }
}
