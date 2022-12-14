package Advanced.filestream.buffering;

import java.io.*;
import java.util.Scanner;

public class BufferedExample {
    public static void main(String[] args) throws IOException {

        String inputFileName = "Data/Input.txt";
        String outputFileName = "Data/OutputExample.txt";

        readFile(inputFileName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text");
        String input = scanner.nextLine();

        writeFile(outputFileName,input);
        readFile(outputFileName);
    }
    //method for reading data
    //input: String (file name)
    public static void readFile(String strFile) throws IOException {
        String line;
        BufferedReader in = new BufferedReader(new FileReader(strFile));
        while ((line = in.readLine()) != null) {
            System.out.println(line);

        }
    }

    //Method for writing data
    //Input: String (file name), String (data)
   public static void writeFile(String strFile, String data) throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter(strFile));
        out.write(data);
        out.close();

            }
    }




