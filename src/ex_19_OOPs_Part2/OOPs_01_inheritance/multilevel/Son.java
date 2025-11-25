package ex_19_OOPs_Part2.OOPs_01_inheritance.multilevel;

public class Son extends Father{

    void bhk3()
    {
        System.out.println("3BHK");
        Son s1= new Son();
        s1.home();
        s1.gf();
        s1.extra();
        s1.bhk3();

        Father f1= new Father();
        f1.home();
        f1.gf();
        f1.extra();

        GrandFather g1= new GrandFather();
        g1.home();
        g1.gf();

        //Dynamic Dispatch

        GrandFather g2= new Son();
        Father f2= new Son();
        // Son s2= new GrandFather();
        //  Son s3= new Father();
    }
}
