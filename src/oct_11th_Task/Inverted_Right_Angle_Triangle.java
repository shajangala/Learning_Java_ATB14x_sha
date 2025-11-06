package oct_11th_Task;

public class Inverted_Right_Angle_Triangle {
    public static void main(String[] args) {
        int n = 3;
        for (int i = n; i >=1; i--)
        {

         for(int j=1; j<=i;j++)
          {
              System.out.print("* "); //(
          }
            System.out.println();
        }
    }
}
