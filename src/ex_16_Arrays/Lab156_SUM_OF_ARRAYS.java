package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int[] numbers = {12,78,92};
        int sum = 0;
        for (int i = 0; i< numbers.length; i++)
        {
            sum= sum+numbers[i];
        }
        System.out.printf("The sum of the numbers of the arrays is %d.",sum);
    }
}
