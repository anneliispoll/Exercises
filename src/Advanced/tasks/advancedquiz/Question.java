package Advanced.tasks.advancedquiz;

public class Question {

    private String text;
    private String[] answers;
    private String correctAnswer;

    public String getText() {
        return text;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }


    //constructor
    public Question(String text, String... answers){
        this.text = text;
        this.answers = answers;
        this.correctAnswer = answers[0];

        //Mixing answers
        for(int i = 0; i < answers.length; i++){
            int randomIndex = (int)(Math.random() * answers.length);
            String temp = answers[i];
            answers[i] = answers[randomIndex];
            answers[randomIndex] = temp;
        }
    }

    public Question(){

    }

}
