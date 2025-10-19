package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args)
    {
       non_return_type_function();
       String name = return_string_type_function();
        System.out.println(name);
    }
     // within the method we can't create another method
    // within the class another class can created

    //No return type
    static void non_return_type_function()
    {
        System.out.println("Hi, there is no return function");
    }

    //Return type - which return a data type (int,string,char, float, boolean)
    static String return_string_type_function()
    {
        System.out.println("Hi, there I will return string data type");
        return "SS";
    }
    static boolean return_boolean()
    {
        return true;
    }
    static float return_float_pi_value()
    {
        return 3.14f;
    }
    static byte return_byte()
    {
        return 100;
    }
    static long return_long()
    {
        return 10l;
    }
}
