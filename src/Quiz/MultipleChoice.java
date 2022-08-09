package Quiz;
import java.util.ArrayList;
public class MultipleChoice extends Question {
public String question = "Which of the following most accurately represents the meaning of 'Pennsylvania':" +
        "\nA: Penn's Transylvania" +
        "\nB: Pen item you find in Castlevania" +
        "\nC: Penn's Woods" +
        "\nD: All of the above" +
        "\n\nPlease indicate your answer by typing the letter that corresponds to your answer choice: ";
public String userAnswer;
    @Override
    public boolean answeredCorrectly() {
        if(userAnswer.toLowerCase() == "c"){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void addQuestion() {

    }
}
