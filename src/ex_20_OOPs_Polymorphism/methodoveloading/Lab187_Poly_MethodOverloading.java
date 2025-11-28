package ex_20_OOPs_Polymorphism.methodoveloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {

     MathOperations m1= new MathOperations();
     int r1= m1.add(2,3);
     int r2= m1.add(78,92,10);
     double r3= m1.add(6.78,89.23);
     String r4= m1.add("Sreenidhi","Sriya");

    }


}


class MathOperations
{
    //In the same class , when you have a method with same name
    // Same name methods but diffrent arguements, different return type

    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a,int b, int c)
    {
        return a+b+c;
    }

    double add(double a,double b)
    {
        return a+b;
    }

    String add(String a, String b)
    {
        return a+b;
    }

}