package ex_12_DoWhile;

public class Lab126_Diff_While_DoWhile {
    public static void main(String[] args) {
         int a = 0;
         while (a < 0)
         {
             System.out.println("It is while loop a value is "+a);
             a++;
         }
         do {
             System.out.println("It is do-while loop a value is "+a);
             a++;
         }while (a < 0);
    }
}
