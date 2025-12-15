package ex_30_Collection_Framework.CF_01_List;

import java.util.ArrayList;
import java.util.List;

public class Lab239_ArrayList_Class_element {
    public static void main(String[] args)
    {
       Student s1= new Student("1","Karthik");
       Student s2= new Student("2","Sreenidhi");
       Student s3= new Student("3","Sriya");
       Student s4= new Student("4","Ishan");

       List<Student> l1= new ArrayList();
       l1.add(s1);
       l1.add(s2);
       l1.add(s3);
       l1.add(s4);

       s1.printDetails();
       s2.printDetails();
       s3.printDetails();
       s4.printDetails();
    }
}

class Student{
    Student(String r,String s)
    {
        this.rollNo=r;
        this.Name=s;
    }


    private String Name;
    private String rollNo;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    // any class by default will extend the Object class

   /* another way of printing
    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\''+
                "Roll No='" + rollNo + '\'' +
                '}';
    }
    */

    public void printDetails()
    {
        System.out.println("Student Name:" + this.Name);
        System.out.println("Student Roll No:" + this.rollNo);
    }
}
