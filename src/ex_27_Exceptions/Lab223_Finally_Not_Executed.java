package ex_27_Exceptions;

public class Lab223_Finally_Not_Executed {
    public static void main(String[] args)
    {
        try{
            int a=10/10;
            System.out.println("Try Executed!");
            System.exit(0);
        }
        catch (Exception e)
        {
            System.out.println("catching the exception");
        }
        finally {
            System.out.println("Hi,I will be always executed!");
        }
    }
}
