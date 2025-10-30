package oct_5th_Task;

public class Second_greatest_number_in_Array {
    public static void main(String[] args) {


        int[] array = {76, 53, 21, 90, 31, 99};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                second_max = max;
                max = num;
            } else if (num > second_max && num < max) {
                second_max = num;

            }
        }
        System.out.printf("Second highest number in the given array is %d", second_max);
    }
}