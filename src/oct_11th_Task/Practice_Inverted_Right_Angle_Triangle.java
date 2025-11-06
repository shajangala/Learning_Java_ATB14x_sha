package oct_11th_Task;

public class Practice_Inverted_Right_Angle_Triangle {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=n; i>=1; i--)
        {
            for(int j=0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
