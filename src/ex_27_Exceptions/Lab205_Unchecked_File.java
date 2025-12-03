package ex_27_Exceptions;

public class Lab205_Unchecked_File {
    public static void main(String[] args)
    {
        int a=0;
        int b=10;
        int c= b/a; // java.lang.Arithmetic Exception
        System.out.println(c);

        String name= null;
        name.trim();    // java.lang.NullPointerException: cannot invoke "String.trim()

    }
}
