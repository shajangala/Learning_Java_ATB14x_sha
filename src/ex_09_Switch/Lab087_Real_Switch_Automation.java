package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        //web automation
        //I will ask the user to give me the input from browser which he wants to
        //use to I will start the automation in that browser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        switch(browser)
        {
            case "chrome":
                System.out.println("Starting with Chrome browser");
                System.out.println("TC1");
                break;
            case "firefox":
                System.out.println("Starting with Firefox browser");
                break;
            case "edge":
                System.out.println("Starting with Edge browser");
                break;
            default:
                System.out.println("I don't have idea which browser it is");
                break;
        }

    }
}
