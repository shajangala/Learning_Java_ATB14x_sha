package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int ram_Salary = 12;
        boolean b = !(ram_Salary > 10 || ram_Salary < 5);
        System.out.println(b);


        //Divide and Conquer
        // A -> ram_Salary > 10 true
        // B -> ram_Salary < 5  false
        // A || B -> true
        //!(true) -> false
    }
}
