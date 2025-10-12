package ex_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {      // 0 to 49; 50 times
            System.out.println(i);  //prints from 0 to 5
            if (i == 5)
            {
                break;
            }
        // System.out.println(i); // it will print only from 0 to 4
        }
    }
}
