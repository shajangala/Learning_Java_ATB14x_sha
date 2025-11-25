package ex_17_OOPs;

public class Lab160_Constructor {
    public static void main(String[] args)
    {
          Student s1= new Student();
          Student s2= new Student("Pramod");
    }
}
class Student{
    String name;

    Student(){
        //DC
        System.out.println("Hi, I am called.");
    }
    Student(String name)
    {
        //PC
        System.out.println("Hi"+name);
    }

  void sleep(){

  }

  void eat(){

  }

  void study(){

  }



}

