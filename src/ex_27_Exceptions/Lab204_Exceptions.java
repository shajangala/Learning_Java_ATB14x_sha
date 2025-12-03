package ex_27_Exceptions;

public class Lab204_Exceptions {
    public static void main(String[] args)
    {
        System.out.println("Start of the program");
        String ip = args[0];  //java.lang.ArrayIndexOutofBound Exception
        int a= Integer.parseInt(ip);  //java.lang.NumberFormat Exception
        int b= 100/a; // java.lang.Arithmetic Exception
        System.out.println(b);
        System.out.println("End of the program");
    }
}
