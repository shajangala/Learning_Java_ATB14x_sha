package sep_20th_Task;

public class Lab068_TO_Real_Age_Classification {
    public static void main(String[] args) {
        /* written for task
        int age=10;
        String s=(age<18)?"minor":((age<60)?"adult":"senior citizen");
        System.out.println("The person is "+s);
        */

        /* How to take Command Line Inputs
       String up1 = args[0];
       String up2 = args[1];
       String up3 = args[2];
        System.out.println(up1);
        System.out.println(up2);
        System.out.println(up3);
        */

        String user_input = args[0];
        int age = Integer.parseInt(user_input);
        System.out.println(age);
        String s=(age < 18)?"minor":((age < 60)?"adult":"senior citizen");
        System.out.println("The person is "+s);


    }
}
