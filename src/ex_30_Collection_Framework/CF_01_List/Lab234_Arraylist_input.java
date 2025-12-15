package ex_30_Collection_Framework.CF_01_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab234_Arraylist_input {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        String continueInput = "Y";
        List<String> list_names= new ArrayList<>();
        while (continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
            String name= scanner.next();
            list_names.add(name);
            scanner.nextLine();

            System.out.println("Do you want to add another name (Y/N):");
            continueInput=scanner.nextLine();
        }

        for (String s:list_names)
        {
            System.out.println(s);
        }
    }
}
