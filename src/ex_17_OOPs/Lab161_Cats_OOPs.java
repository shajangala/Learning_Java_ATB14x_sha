package ex_17_OOPs;

import org.w3c.dom.ls.LSOutput;

public class Lab161_Cats_OOPs {
    public static void main(String[] args) {
        Cat c1;
        Cat c2;
        Cat c3 = new Cat();
        Cat c4= new Cat("Lucy");
        Cat c5= new Cat("Spicy");
        Cat c6= new Cat("Mirchi");

        new Cat();
        System.out.println(c4.name);
        System.out.println(c5.name);
        c4.running();
        c5.running();
        c6.running();
    }
}

class Cat{
    String name;

    Cat(){
        name="Kitty";
    }

    Cat(String nameparam){
        this.name=nameparam;
    }
    void running(){
        System.out.println("Who is running "+this.name);
    }
}
