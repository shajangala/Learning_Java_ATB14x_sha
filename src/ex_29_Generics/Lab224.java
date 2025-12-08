package ex_29_Generics;

public class Lab224 {
    public static void main(String[] args) {

        temp_sum_t(3,7);
        temp_sum_t(47.9,76.987);
        temp_sum_t("Shamili","Jangala");
        temp_sum_t(98,67.89);
    }


   /* static Integer temp_sum(Integer a,Integer b){
        return a+b;
    }
    static Double temp_sum(Double a,Double b){
        return a+b;
    }*/

    static <T> T temp_sum_t(T a, T b)
    {
        return null;
    }
}