package ex_27_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219_Throws {
    public static void main(String[] args) throws FileNotFoundException
    {
        FileReader fr= new FileReader(new File("c:\\abc.txt"));

    }
}
