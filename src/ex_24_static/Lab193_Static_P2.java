package ex_24_static;

public class Lab193_Static_P2 {

}

class ATB{
    int ph_no;
    String name;
    static String course_name="ATB14x";

    static void markAttendance(){
        System.out.println("Mark Attendance");
        // System.out.println(this.ph_no);
    }

    void display(){
        System.out.println(this.ph_no + this.name + course_name);
    }
}
