package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        //in JDK > 13
        int itemcode = 006;
        switch (itemcode)
        {
            case 001,002,005:
                System.out.println("All are Electrical items,Thank you");
                break;
            case 004,006,007:
                System.out.println("These are Mechanical parts");
                break;
            default:
                System.out.println("None");
        }
    }
}
