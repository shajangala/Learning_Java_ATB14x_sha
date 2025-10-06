package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        int total1 = (int)(course + GST) ; //Explicit -> Narrowing
        System.out.println(total1);

        float total2 = course + GST;
        System.out.println(total2); //implicit -> Widening
    }
}
