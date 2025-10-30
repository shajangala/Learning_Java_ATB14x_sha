package ex_16_Arrays;

public class Lab155_Array_Reverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reverse = new int[5];
        int j = 0;
        for(int i= numbers.length-1; i >= 0; i--) {

                reverse[j]=numbers[i];
                j++;
            }

        for(int reverse_array : reverse)
        {
            System.out.print(reverse_array+ " ");
        }
    }
}
