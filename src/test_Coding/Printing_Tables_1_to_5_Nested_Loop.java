package test_Coding;

public class Printing_Tables_1_to_5_Nested_Loop {
    public static void main(String[] args) {
        System.out.println("Printing the tables from 1 to 5");
        for (int i = 1; i <= 5; i++) //incrementing the i value to print the 1 to 5 tables
        {
            switch (i) // Using switch case to print the 1 to 5 tables
            {
                case 1:
                    int j=1;
                    System.out.println("Table of 1:");
                    for(int n = 1; n <= 10; n++)
                    {

                        System.out.printf("%d * %d = %d ", n, j, (n * j));
                    }
                    System.out.println();
                    break;
                case 2:
                    int k=2;
                    System.out.println("Table of 2:");
                    for(int n = 1; n <= 10; n++)
                    {

                        System.out.printf("%d * %d = %d ", n, k, (n * k));
                    }
                    System.out.println();
                    break;
                case 3:
                    int l=3;
                    System.out.println("Table of 3:");
                    for(int n = 1; n <= 10; n++)
                    {

                        System.out.printf("%d * %d = %d ", n, l, (n * l));
                    }
                    System.out.println();
                    break;
                case 4:
                    int m=4;
                    System.out.println("Table of 4:");
                    for(int n = 1; n <= 10; n++)
                    {

                        System.out.printf("%d * %d = %d ", n, m, (n * m));
                    }
                    System.out.println();
                    break;
                case 5:
                    int o=5;
                    System.out.println("Table of 5:");
                    for(int n = 1; n <= 10; n++)
                    {

                        System.out.printf("%d * %d = %d ", n, o, (n * o));
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid number incremented using loop");
            }
        }
    }
}
