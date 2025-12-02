package ex_24_static;

public class Lab195_Real {

}
class ATB14x
{
    {
        System.out.println("IIB-this is called when object is created");

        //what is the purpose?[Instance initialisation block]

        //Here you can write code related to
        // start a website or anything before starting the
        // webautomation or api
        //
    }

    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name;
    private String phone;
    static  String courseName="ATB14x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non static method");
        System.out.println(courseName);
    }

    static void doAssignment(){
        // System.out.println(phone); static method can't access the non static variables
        System.out.println("Do Assignment");
    }
}