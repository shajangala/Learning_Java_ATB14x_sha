package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int[] marks={90, 91, 51, 100, 91, 92,89};

        boolean[] is_married_people = {true,true,false};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

        String name = "Pramod";
        String[] name_each_element_char = name.split("");
        for(String s:name_each_element_char)
        {
            System.out.println(s);
        }

    }
}
