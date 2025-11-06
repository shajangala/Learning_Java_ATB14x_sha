package ex_16_Arrays;

public class Lab164_2nd_highest_Array {
    public static void main(String[] args)
    {
        int[] numbers = {23,76,43,57,99,12};
        int max =0;
        int second_max = 0;

        for(int num : numbers)
        {
            if(num >max)
            {
                second_max = max;
                max= num;
            }
            else if (num > second_max && num < max) {

                second_max = num;
            }
        }
        System.out.printf("Second max number in the given array is %d",second_max);


    }
}
