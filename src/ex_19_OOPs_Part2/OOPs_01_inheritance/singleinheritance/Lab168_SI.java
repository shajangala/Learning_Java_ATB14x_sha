package ex_19_OOPs_Part2.OOPs_01_inheritance.singleinheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();

        Father f1= new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

    }
}
