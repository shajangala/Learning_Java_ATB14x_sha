package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args)
    {
        /*User defined functions
            1. Without parameters and without return type
            2. without parameters and with return type
            3. with parameters and without return type
            4. with parameters and with return type  */

        // 1. Without parameters and without return type - calling
        wor_wod_greet();

        // 2. without parameters and with return type - calling

        String msg = wop_wr_greet_2();
        System.out.println(msg);

        // 3. with parameters and without return type - calling

        wp_wor_greet_3("sreesri", 45, 96000);

      // 4. with parameters and with return type

        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_three_numbers(4,6,9);
        float sum3 = sum_of_three_numbers_float(3000,4389,3);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    // 1. Without parameters and without return type (Declare) / Define

    static void wor_wod_greet()
    {
        System.out.println("Hi, Type 1 Function!");
        System.out.println("Hi There!!");
    }

    // 2. without parameters and with return type (Declare) / Define

    static String wop_wr_greet_2()
    {
        System.out.println("Hi, Type 2 Function!");
        return  "Hi,Hello";
    }

    // 3. With parameter and without return type (Declare) / Define

    static void wp_wor_greet_3(String name, int age, double salary)
    {
        System.out.println("Hi, Type 3 Function!");
        System.out.println("Your name is ->" + name + "\n Your age is ->" + age + "\n your salary is ->" + salary);
    }

    // 4. with parameters and with return type  (Declare)/Define

    static int sum_of_two_numbers(int a, int b)
    {
        return a + b;
    }

    static int sum_of_three_numbers(int a,int b,int c)
    {
        return a+b+c;
    }

    static float sum_of_three_numbers_float(float a,float b,float c)
    {
        return a+b+c;
    }

}
