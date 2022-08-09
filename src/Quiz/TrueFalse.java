package Quiz;
import java.util.ArrayList;
import java.util.Scanner;
public class TrueFalse extends Question {
    public static String question = "True or false: The capital of Pennsylvania is Philadelphia. Please type 'true' or 'false': ";
    public static String answer = "false";
    public static ArrayList<String> questions = new ArrayList<>();
    public static ArrayList<String> answers = new ArrayList<>();
   public static ArrayList userAnswers = new ArrayList();

static{
    questions.add(question);
    answers.add(answer);
}
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
            System.out.println("Please type the text of your true or false question: ");
            newQuestion = input.next();
            System.out.println("Please indicate whether the answer to your question is true or false. " +
                    "Type 't' to indicate true, and 'f' to indicate false: ");
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
