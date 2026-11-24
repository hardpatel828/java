// Write a Java Program to read the data from the file using
// FileInputStream.

import java.io.*;

class P8_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("input.txt");

        int ch;

        while ((ch = fin.read()) != -1) {
            System.out.print((char) ch);
        }

        fin.close();
    }
}