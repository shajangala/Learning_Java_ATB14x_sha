package ex_27_Exceptions;

import java.util.Scanner;

public class LabThrow {
    public static void main(String[] args) throws CustomExp {
        Scanner sc=new Scanner(System.in);
        if(!sc.next().equalsIgnoreCase("Shamili"))
        {
              throw new CustomExp("Not allowed");
        }
    }
}

class CustomExp extends Exception{
    CustomExp(String msg)
    {
        super(msg);
    }
}