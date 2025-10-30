package ex_16_Arrays;
import java.util.*;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] numbers ={12,34,10,1,100,3,4,32};

    //Sorting using in-built function

       /*
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
       */

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int num:numbers)
        {
            if (num > max)
            {
                second_max = max;
                max =num;
            } else if (num > second_max && num < max) {
                second_max = num;
                
            }

        }

        System.out.printf("The highest number in the given array is %d.",max).println();
        System.out.printf("The second highest number in the given array is %d.",second_max);

    }
}
