package ex_26_Wrapper_Classes;

public class Lab203_Wrapper_Conversion {
    public static void main(String[] args)
    {
        String num="10";
        int aa=10;

        //String to Wrapper Conversion
        Integer a= Integer.parseInt(num);

        //double.parseDouble()
        //long.parse
        //Float.parseFloat()

        int a_p= Integer.parseInt(num); //String to primitive

        Integer aa3= Integer.valueOf("10");
        System.out.println(aa3);

        Integer aa10=10;
        String s= aa10.toString();
        System.out.println(s);
        System.out.println(s instanceof String);




    }
}
