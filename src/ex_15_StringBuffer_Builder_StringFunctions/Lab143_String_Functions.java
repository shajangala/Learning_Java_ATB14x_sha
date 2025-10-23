package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("n"));
        System.out.println(name.concat("new"));
        System.out.println(name.contains("nl"));
        System.out.println(name.equals("sonal"));
        System.out.println(name.equalsIgnoreCase("SONAL"));

        System.out.println(String.join("*","new", "hello"));

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());
    }
}
