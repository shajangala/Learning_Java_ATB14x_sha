package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab186_Better_Abstract_Class {
public static void main(String[] args) {
    Alto a = new Alto();
    a.drive();
}
}

abstract class Car1{
    abstract void startCar();
    abstract void stopCar();
}

class Alto extends Car1 implements Tyre,Gear{

    void drive(){

        rubbertype();
        blackColorDoToTyre();
        this.startCar();
        changeGear();
        this.stopCar();
    }
    @Override
    void startCar()
    {
        System.out.println("Starting the Car");
    }

    void stopCar()
    {
        System.out.println("Stoping the Car");
    }

    @Override
    public void changeGear() {
        System.out.println("Change Gear");
    }

    @Override
    public void rubbertype() {
        System.out.println("Rubber type tyre");
    }

    @Override
    public void blackColorDoToTyre() {
        System.out.println("Black tyre of the Car");
    }
}

interface Tyre{
    abstract void rubbertype();
    void blackColorDoToTyre();
}

interface Gear{
    void changeGear();
}