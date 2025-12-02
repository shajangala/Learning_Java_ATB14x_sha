package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab187_Interface_P1 {
 public static void main(String[] args)
 {
     car2 c2=new car2();
     c2.drive();
 }
}
class car2 implements Brakes,Engine1
{
    void drive()
    {
        startEngine();
        applyBreak();
        stopEngine();
    }
    @Override
    public void testEngine(){
        System.out.println("Override by Car2");
    }
    @Override
    public void applyBreak() {
        System.out.println("apply break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}
interface Brakes{
    void applyBreak();
}
interface Engine1{
    void startEngine();
    void stopEngine();

    default void testEngine()
    {
        System.out.println("Concrete complete");
    }
    default void testEngine1(){
        System.out.println("Concrete complete");
    }
}
