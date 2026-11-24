// Write a Java Program to read the data from the file and copy it on
// another file.

import java.io.*;

class P8_3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("input.txt");
        FileOutputStream fout = new FileOutputStream("output.txt");

        int ch;

        while ((ch = fin.read()) != -1) {
            fout.write(ch);
        }

        fin.close();
        fout.close();

        System.out.println("File copied successfully.");
    }
}