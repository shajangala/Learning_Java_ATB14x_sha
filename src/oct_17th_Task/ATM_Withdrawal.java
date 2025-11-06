package oct_17th_Task;

import java.util.Scanner;

public class ATM_Withdrawal {
    public static void main(String[] args)
    {
        int account_balance = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw:");
        if (scanner.hasNextInt())
        {
            int withdraw_amount = scanner.nextInt();
            if (withdraw_amount > 0 && withdraw_amount <= account_balance)
            {
                if (withdraw_amount%100 == 0)
                {
                    int total_balance;
                    total_balance = account_balance - withdraw_amount;
                    System.out.printf("Your account balance is %d",total_balance);
                }
                else {
                    System.out.println("Please enter the withdraw amount multiples of 100 only");
                }
            }
            else
            {
                System.out.println("Insufficient account balance");
            }
        }
        else {
            System.out.println("Please enter the with drawl amount correct");
        }

    }
}
