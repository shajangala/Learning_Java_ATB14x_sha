package ex_16_Arrays;

public class LeftAngleTriangle {
    public static void main(String[] args)
    {
        int n=3;
        for (int i=0; i<n; i++)
        {
            for (int j=i; j< n-1; j++)
            {
                System.out.print(" "); // (0,0) (0,1) (0,2)
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print("*"); // (0,0)
            }
            System.out.println();
        }
    }
}
