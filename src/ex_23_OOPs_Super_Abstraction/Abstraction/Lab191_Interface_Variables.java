package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab191_Interface_Variables {
    public static void main(String[] args)
    {

    }
}

interface Pramod{
    int a=10;
    void display();
}

class Dutta implements Pramod{

    int aa=10;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);
    }
}

interface TTA{
    void practice();
    void teaching();
}

class pramod1 implements TTA{

    @Override
    public void practice() {

    }

    @Override
    public void teaching() {

    }
}
class student implements TTA{

    @Override
    public void practice() {

    }

    @Override
    public void teaching() {

    }
}

interface TTA_Mentor
{
    void teach();
}

class Pramod_Mentor implements TTA_Mentor{

    @Override
    public void teach() {

    }
}
class Dipak_Mentor implements TTA_Mentor{

    @Override
    public void teach() {

    }
}