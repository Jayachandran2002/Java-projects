package exercisePackage;

import java.io.IOException;
import java.io.*;

public class FileStreamTester {

    public static void main(String[] args) throws IOException {


        FileInputStream inFile = null;
        try {
            inFile = new FileInputStream("ReadFrom.txt");


            int i = inFile.read();
            while (i != -1) {
                System.out.print((char)i);
                i = inFile.read();
            }
        } catch (IOException io) {
            io.fillInStackTrace();
        } finally {
            if (inFile != null) inFile.close();

        }
    }
}