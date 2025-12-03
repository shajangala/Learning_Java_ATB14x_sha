package ex_26_Wrapper_Classes;

public class Lab204_Wrapper {
    public static void main(String[] args)
    {
        int a=10;
        Integer aa=a;
        System.out.println(aa); //Boxing-  Primitive to Wrapper - Auto Boxing - JVM will do it

        System.out.println(aa.intValue());
        System.out.println(a);

        //UnBoxing   Wrapper - primitive
        Integer i=48;
        int i1= i;  //Unboxing
        System.out.println(i1);

    }
}
