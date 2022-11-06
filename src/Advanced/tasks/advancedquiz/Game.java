package Advanced.tasks.advancedquiz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static ArrayList<Question> questions = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        char again = 'y';
        char option = 'p';
        Scanner scanner = new Scanner(System.in);
        while (again == 'y') {
            System.out.println("Please choose quiz topic");
            System.out.println("1 - Capitals");
            System.out.println("2 - Books");
            System.out.println("3 - Rivers");

            System.out.println("Topic: ");
            int input = scanner.nextInt();

            System.out.println("Do you want to play or add new question? Choose either p, a or r");
            //line fix
            scanner.nextLine();
            option = scanner.nextLine().charAt(0);

            if (option == 'p') {
                System.out.println("Loading quiz...");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {

                }
                init(input);
                System.out.println("Quiz loaded!");
                loop();
            } else if (option == 'a') {
                addQuestion(input);
            } else if (option == 'r') {
                removeQuestion();
            } else {
                System.out.println("Invalid option");
            }

            System.out.println("Do you want to do something again? Choose either y or n");
            again = scanner.nextLine().charAt(0);
        }
    }

    private static void init(int number) {
        try {

            List<String> lines = Files.readAllLines(Paths.get("Data/quiz" + number + ".txt"));

            int numberOfLinesPerQuestion = Integer.parseInt(lines.get(0)) + 1;
            for (int i = 1; i < lines.size(); i += numberOfLinesPerQuestion) {
                Question q;

                if (numberOfLinesPerQuestion == 4) {
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3));

                } else {
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3), lines.get(i + 4));

                }

                questions.add(q);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println("Could not load the file");
            System.out.println(5);
        }
    }

    private static void loop() {

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while (questions.size() > 0) {
            Question currentQuestion = questions.remove(0);
            System.out.println(currentQuestion.getText());
            for (int i = 0; i < currentQuestion.getAnswers().length; i++) {
                System.out.println(i + 1 + ")" + currentQuestion.getAnswers()[i]);
            }

            System.out.println("Answer: ");
            int input = scanner.nextInt();

            if (input < 0 || input > currentQuestion.getAnswers().length) {
                System.out.println("Input is invalid");
                System.exit(10);
            }

            if (currentQuestion.getCorrectAnswer().equals(currentQuestion.getAnswers()[input - 1])) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("Wrong");
            }
        }

        System.out.println("You got " + score + " questions correct");
    }

    private static void addQuestion(int number) {
        Scanner scanner = new Scanner(System.in);
        Question q = new Question();

        System.out.println("Please enter question");
        String text = scanner.nextLine();
        q.setText(text);

        try {

            List<String> lines = Files.readAllLines(Paths.get("Data/quiz" + number + ".txt"));
            String[] answers = new String[Integer.parseInt(lines.get(0))];

            System.out.println("Please enter 1. answer as correct one");
            for (int i = 0; i < answers.length; i++) {
                System.out.println("Please enter " + (i + 1) + " answer");
                answers[i] = scanner.nextLine();
            }

            q.setAnswers(answers);
            File file = new File("Data/quiz" + number + ".txt");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);

            //writing in file in new line question text
            br.write("\n" + q.getText());
            for (int i = 0; i < q.getAnswers().length; i++) {
                br.write("\n" + q.getAnswers()[i]);

            }

            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }



   private static void removeQuestion() throws IOException{

        System.out.println("Please enter from which quiz you want to delete the question");
        System.out.println("1 - Capitals");
        System.out.println("2 - Books");
        System.out.println("3 - Rivers");

        System.out.println("Topic: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        try {

            File inputFile = new File("Data/quiz" + number + ".txt");
            File tempFile = new File("Data/quiz" + number + ".txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));


            System.out.println("Enter line number what you want to delete");
            String currentLine;
            int lineToRemove = scanner.nextInt();
            int count = 0;

            while ((currentLine = reader.readLine()) != null) {
                count++;
                if (count == lineToRemove) {
                    break;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }

            writer.close();
            reader.close();
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Successfully deleted");

        } catch (Exception e) {
           System.out.println(e);
       }
    }
}



