package ex_09_Switch;
import java.util.Scanner;
public class Lab086_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7:");
        int day = scanner.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }
    }
}

