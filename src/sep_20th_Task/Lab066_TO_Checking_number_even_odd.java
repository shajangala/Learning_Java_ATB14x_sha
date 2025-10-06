package sep_20th_Task;

public class Lab066_TO_Checking_number_even_odd {
    public static void main(String[] args) {
        int number=23;
        String S=(number%2==0)?"even number.":"odd number.";
        System.out.println("The given number is "+S);
    }
}
