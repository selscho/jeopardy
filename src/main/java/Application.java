import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application implements JeopardyUIListener {
    JeopardyUI jeopardyUI = new JeopardyUI(this);
    String[][] listOfQuestions = new String[6][5];
            //{{, "Question Category 2, score 200.", "Question Category 3, score 200.", "Question Category 4, score 200.", "Question Category 5, score 200.", "Question Category 6, score 200."},
           // {}, {}, {}, {}}; // 200 p. questions first, then 400-point-questions ...

    private int pointsTeam1 = 0;
    private int pointsTeam2 = 0;

    public Application(){
        // initialise array of questions
        listOfQuestions[0][0] = "Question Category 1, score 200.";
        listOfQuestions[1][0] = "Question Category 2, score 200.";
        listOfQuestions[2][0] = "Question Category 3, score 200.";
        listOfQuestions[3][0] = "Question Category 4, score 200.";
        listOfQuestions[4][0] = "Question Category 5, score 200.";
        listOfQuestions[5][0] = "Question Category 6, score 200.";

        listOfQuestions[0][1] = "Question Category 1, score 400.";
        listOfQuestions[1][1] = "Question Category 2, score 400.";
        listOfQuestions[2][1] = "Question Category 3, score 400.";
        listOfQuestions[3][1] = "Question Category 4, score 400.";
        listOfQuestions[4][1] = "Question Category 5, score 400.";
        listOfQuestions[5][1] = "Question Category 6, score 400.";

        listOfQuestions[0][2] = "Question Category 1, score 600.";
        listOfQuestions[1][2] = "Question Category 2, score 600.";
        listOfQuestions[2][2] = "Question Category 3, score 600.";
        listOfQuestions[3][2] = "Question Category 4, score 600.";
        listOfQuestions[4][2] = "Question Category 5, score 600.";
        listOfQuestions[5][2] = "Question Category 6, score 600.";

        listOfQuestions[0][3] = "Question Category 1, score 800.";
        listOfQuestions[1][3] = "Question Category 2, score 800.";
        listOfQuestions[2][3] = "Question Category 3, score 800.";
        listOfQuestions[3][3] = "Question Category 4, score 800.";
        listOfQuestions[4][3] = "Question Category 5, score 800.";
        listOfQuestions[5][3] = "Question Category 6, score 800.";

        listOfQuestions[0][4] = "Question Category 1, score 1000.";
        listOfQuestions[1][4] = "Question Category 2, score 1000.";
        listOfQuestions[2][4] = "Question Category 3, score 1000.";
        listOfQuestions[3][4] = "Question Category 4, score 1000.";
        listOfQuestions[4][4] = "Question Category 5, score 1000.";
        listOfQuestions[5][4] = "Question Category 6, score 1000.";


    }

    public void run() {
        jeopardyUI.showOverview();
    }

    @Override
    public void onOverviewButtonClicked(int x, int y) {
        JeopardyQuestion jeopardyQuestion = new JeopardyQuestion(listOfQuestions[x][y], 0);
        if (y == 0) {
            jeopardyQuestion.setQuestionScore(200);
        } else if (y == 1) {
            jeopardyQuestion.setQuestionScore(400);
        } else if (y == 2) {
            jeopardyQuestion.setQuestionScore(600);
        } else if (y == 3) {
            jeopardyQuestion.setQuestionScore(800);
        } else {
            jeopardyQuestion.setQuestionScore(1000);
        }

        jeopardyUI.showQuestion(jeopardyQuestion);
    }

    @Override
    public void onQuestionCompletedClicked() {
        // TODO: score aktualisieren und layout der scores aktualisieren
        jeopardyUI.showOverview();
    }

}
