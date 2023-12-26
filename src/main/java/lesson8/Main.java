package lesson8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            readFile("no_file.txt");
        } catch (IOException e) {
            System.out.println("FileError: " + e.getMessage());
        }
    }


    public static void readFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException("File not found or error reading the file: " + fileName, e);
        }
    }

}


