package Advanced.tasks.advancedquiz;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileExample {

    public static void main(String[] args) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("Data/quiz1.txt"));
            //System.out.println(lines);
            //System.out.println(lines.get(0));
            //System.out.println(lines.get(2));
            //System.out.println(lines.size());
            System.out.println();

        } catch (Exception e) {
            System.out.println(e);
        }

        try {

            if (10 > 1){
                System.exit(15);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
