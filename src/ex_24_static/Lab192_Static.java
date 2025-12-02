package ex_24_static;

public class Lab192_Static {
    public static void main(String[] args)
    {
        Student s1= new Student(20);
        Student s2= new Student(32);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.course_name);

        System.out.println(s1.course_name);
        System.out.println(s2.course_name);


        Student.m1();

    }

}

class Student{
    int age;    //non static or instance variable, Attributes
    static String course_name="ATB14x";

    public Student(int age_c){
        this.age=age_c;
    }

    static void m1(){
        System.out.println("I am static Method");
    }
}
