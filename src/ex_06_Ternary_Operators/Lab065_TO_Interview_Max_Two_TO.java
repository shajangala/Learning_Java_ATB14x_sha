package ex_06_Ternary_Operators;

public class Lab065_TO_Interview_Max_Two_TO {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println(Math.max(x,y));

        int max = (x > y)? x : y;
        System.out.println(max);
    }
}
