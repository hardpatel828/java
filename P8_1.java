// Write a Java Program to reverse the elements of an array read from the
// file and store it in another file. Use FileInputStream and
// FileOutputStream.


import java.io.*;

class P8_1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("input.txt");
        FileOutputStream fout = new FileOutputStream("output.txt");

        byte[] data = fin.readAllBytes();

        for (int i = data.length - 1; i >= 0; i--) {
            fout.write(data[i]);
        }

        fin.close();
        fout.close();

        System.out.println("Array elements reversed successfully.");
    }
}