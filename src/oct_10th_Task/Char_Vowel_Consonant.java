package oct_10th_Task;

import java.util.Scanner;

public class Char_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character to find Vowel or consonant");
        if (scanner.hasNext()) {
            String s = scanner.next();
            if (s.length() == 1 && Character.isLetter(s.charAt(0))) {
                char c = s.charAt(0);
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    System.out.printf("The character %c is an Vowel", c);
                } else {
                    System.out.printf("The character %c is a Consonant", c);
                }
            } else {
                System.out.println("Please enter correct input as a single character only");
            }
        }

        }
    }