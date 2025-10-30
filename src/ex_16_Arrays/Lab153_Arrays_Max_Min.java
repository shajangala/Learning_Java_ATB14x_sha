package ex_16_Arrays;
import java.util.*;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        //in-built function to sort the arrays

     /*   Arrays.sort(array);
        System.out.println(array[array.length-1]);*/
        int max = array[0];
        for (int i=0; i< array.length; i++)
        {
            if(max < array[i])
            {
               max =array[i];
            }
        }
        System.out.printf("Maximum number in the array is %d.",max).println();

        int min = array[0];
        for (int j=0; j<array.length; j++)
        {
            if(min > array[j])
            {
                min = array[j];
            }
        }
        System.out.printf("Minimum number in the array is %d.",min);
    }
}
