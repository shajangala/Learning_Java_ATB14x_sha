package ex_27_Exceptions;

public class Lab216_EC {
    public static void main(String[] args)
    {
        try
        {
            String ip=args[0];
            int a= Integer.parseInt(ip);
            int b=100/a;
            System.out.println(b);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
