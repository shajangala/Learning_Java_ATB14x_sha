package ex_27_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab206_Checked {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Hi");
        }
    }
}
