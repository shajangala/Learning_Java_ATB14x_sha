package oct_5th_Task;
import java.util.*;

public class Number_Of_Words_In_A_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new String to find its number of its words");
        String user_input = scanner.nextLine();

        String[] arr = user_input.split("\\s+");
        System.out.println(arr.length);

    }
}
