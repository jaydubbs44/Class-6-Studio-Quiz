package Quiz;
import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {
public static String question = "Please indicate which of the following are commonly used nicknames for Philadelphia: " +
        "\nA: Philly" +
        "\nB: The city of brotherly hugs" +
        "\nC: The city of brotherly love" +
        "\nD: New Jersey's only major city" +
        "\n\nPlease indicate your answers by typing the letters of your answer choices one after the other, capitalized, in alphabetical order; e.g. 'ABCD'";

    public static ArrayList<String> questions = new ArrayList<>();
    public static ArrayList<String> answers = new ArrayList<>();

    public static ArrayList userAnswers = new ArrayList();


    @Override
    public boolean answeredCorrectly() {
        for (String q: questions){
            int i = 0;
            if (userAnswers.get(i) == answers.get(i)){
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public void addQuestion() {
        String newQuestion;
        String newAnswer;
        String addAnother;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please type the text of your Checkbox question: ");
            newQuestion = input.next();
            System.out.println("Please indicate the answer for your Checkbox question by typing the letters that correspond to \n" +
                    "your answers, capitalized, in alphabetical order, e.g. 'ABCD': ");
            newAnswer = input.next();

            questions.add(newQuestion);
            answers.add(newAnswer);

            System.out.println("Would you like to add another question? " +
                    "If so, type 'Y' or 'y'. If not, type 'N' or 'n'.");
            addAnother = input.next();
            input.close();

        }while(addAnother != "n" || addAnother != "N");
    }
}
