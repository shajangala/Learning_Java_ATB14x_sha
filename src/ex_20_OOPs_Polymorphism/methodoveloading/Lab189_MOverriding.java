package ex_20_OOPs_Polymorphism.methodoveloading;

public class Lab189_MOverriding {
public static void main(String[] args) {

    //Run time polymorphism
    son s1= new son();
    s1.home();

    Father f1= new Father();
    f1.home();

    Father f2= new son(); //Dynamic dispatch
    f2.home();

    // son s2= new Father(); not possible
}

}

class Father
{
    void home()
    {
        System.out.println("2 BHK");
    }
}

class son extends Father{

    @Override
    void home()
    {
        System.out.println("3 BHK");
    }
}