package Advanced.filestream.buffering;

import java.io.*;
import java.util.ArrayList;

public class DataBuffer {
    public static void main(String[] args) throws IOException {

/*        FileReader fileReader = new FileReader("Data/Input.txt");
        BufferedReader in = new BufferedReader(fileReader);*/
        BufferedReader in = new BufferedReader(new FileReader("Data/Input.txt"));

        ArrayList<String> arrayList = new ArrayList<>();
        //read data
        String line;
        while ((line = in.readLine()) != null){
            arrayList.add(line);
            System.out.println(line);

        }
        System.out.println(arrayList);



        //how to write data
        BufferedWriter out = new BufferedWriter(new FileWriter("Data/BufferedOutput.txt"));
        //Write String to file
        String data = "This is the data in Buffered Output file.\nThis is new line";
        out.write(data);
        out.close();

    }
}
