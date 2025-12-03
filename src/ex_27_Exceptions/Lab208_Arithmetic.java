package ex_27_Exceptions;

public class Lab208_Arithmetic {
    public static void main(String[] args) {

        int a=0;
        int b=10;
        int c= 0;
        try {
            c = b/a;
        }
        catch (ArithmeticException e) {
            System.out.println("Division with zero is not possible");
        }
        catch
        (Exception e) {
            System.out.println("Not allowed the division with zero");
        }
        catch (Throwable e){
            System.out.println("Not allowed the operation");
        }

    }
}
