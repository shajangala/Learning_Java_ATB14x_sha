package test_Coding;

public class Increment_Decrement_Operator {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Original: "+i); //prints the original initialised value
        System.out.println("Pre-Increment: "+ ++i ); //first increments the i value then prints i becomes 6
        System.out.println("Post-Increment: "+ i++ + "( returned 6)"); //first prints the i value then increments i becomes 7
        i = 6; // Again i value is initialised for the desired output
        System.out.println("pre-Decrement: "+ --i + "( returned 5)"); //first decrements the i value then prints i value i becomes 5
        System.out.println("Post-Decrement: "+ i-- + "( returned 5)"); //first prints the i value then decrements after printing i becomes 4
    }
}
