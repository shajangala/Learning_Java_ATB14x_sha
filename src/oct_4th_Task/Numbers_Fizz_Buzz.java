package oct_4th_Task;

public class Numbers_Fizz_Buzz {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if(i%3 == 0) {
                if (i%5 == 0) {
                    System.out.println("FizzBuzz");
                    continue;
                }
                System.out.println("Fizz");
                continue;
            }
            if (i%5 == 0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
            }

        }
    }
