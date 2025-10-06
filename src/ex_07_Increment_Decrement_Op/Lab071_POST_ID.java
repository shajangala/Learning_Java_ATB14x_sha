package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {
     /*   int a = 10;
        System.out.println(++a);*/

        int a_post = 10;
        int b = a_post++; //assigns the value and then increments
        System.out.println(a_post);
        System.out.println(b);

    }
}
