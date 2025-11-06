package ex_16_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab166_BufferReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine().trim());
        System.out.println(N);
    }
}
