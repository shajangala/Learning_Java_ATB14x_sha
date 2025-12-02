package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab182 {
    public static void main(String[] args){
        Car tesla= new Car(200);
        tesla.drive();
    }
}

class Vehicle{
    public int maxSpeed=180;

    void noTest()
    {
        System.out.println("Empty!");
    }

    Vehicle()
    {
        System.out.println("Default constructor");
    }

    Vehicle(int a)
    {
        System.out.println("Parameterized constructor");
    }

    Vehicle(int a, int b)
    {
        System.out.println("Multiple parameterized constructor");
    }

    void message()
    {
        System.out.println("No return, No Arguement");
    }

    void message(int a)
    {
        System.out.println("PC-Method overloading");
    }

    void drive(){
        System.out.println("Vehicle of Parent");
    }

}

class Car extends Vehicle{
    private int maxSpeed=281;

    Car(){
        super(100);
    }
    Car(int a){
        System.out.println("PC Car");
    }
    void test()
    {

    }

    @Override
    void drive() {
        System.out.println("overridden Vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }
}
