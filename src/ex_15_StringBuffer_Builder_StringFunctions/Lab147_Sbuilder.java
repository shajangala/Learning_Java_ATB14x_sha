package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab147_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
