import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application implements JeopardyUIListener {
    JeopardyUI jeopardyUI = new JeopardyUI(this);
    JeopardyQuestion[][] listOfQuestions = new JeopardyQuestion[6][5];

    private int pointsTeam1 = 0;
    private int pointsTeam2 = 0;

    public Application(){
        // initialise array of questions
        listOfQuestions[0][0] = new JeopardyQuestion("Question Category 1, score 200.", 200);
        listOfQuestions[1][0] = new JeopardyQuestion("Question Category 2, score 200.", 200);
        listOfQuestions[2][0] = new JeopardyQuestion("Question Category 3, score 200.", 200);
        listOfQuestions[3][0] = new JeopardyQuestion("Question Category 4, score 200.", 200);
        listOfQuestions[4][0] = new JeopardyQuestion("Question Category 5, score 200.", 200);
        listOfQuestions[5][0] = new JeopardyQuestion("Question Category 6, score 200.", 200);

        listOfQuestions[0][1] = new JeopardyQuestion("Question Category 1, score 400.", 400);
        listOfQuestions[1][1] = new JeopardyQuestion("Question Category 2, score 400.", 400);
        listOfQuestions[2][1] = new JeopardyQuestion("Question Category 3, score 400.", 400);
        listOfQuestions[3][1] = new JeopardyQuestion("Question Category 4, score 400.", 400);
        listOfQuestions[4][1] = new JeopardyQuestion("Question Category 5, score 400.", 400);
        listOfQuestions[5][1] = new JeopardyQuestion("Question Category 6, score 400.", 400);

        listOfQuestions[0][2] = new JeopardyQuestion("Question Category 1, score 600.", 600);
        listOfQuestions[1][2] = new JeopardyQuestion("Question Category 2, score 600.", 600);
        listOfQuestions[2][2] = new JeopardyQuestion("Question Category 3, score 600.", 600);
        listOfQuestions[3][2] = new JeopardyQuestion("Question Category 4, score 600.", 600);
        listOfQuestions[4][2] = new JeopardyQuestion("Question Category 5, score 600.", 600);
        listOfQuestions[5][2] = new JeopardyQuestion("Question Category 6, score 600.", 600);

        listOfQuestions[0][3] = new JeopardyQuestion("Question Category 1, score 800.", 800);
        listOfQuestions[1][3] = new JeopardyQuestion("Question Category 2, score 800.", 800);
        listOfQuestions[2][3] = new JeopardyQuestion("Question Category 3, score 800.", 800);
        listOfQuestions[3][3] = new JeopardyQuestion("Question Category 4, score 800.", 800);
        listOfQuestions[4][3] = new JeopardyQuestion("Question Category 5, score 800.", 800);
        listOfQuestions[5][3] = new JeopardyQuestion("Question Category 6, score 800.", 800);

        listOfQuestions[0][4] = new JeopardyQuestion("Question Category 1, score 1000.", 1000);
        listOfQuestions[1][4] = new JeopardyQuestion("Question Category 2, score 1000.", 1000);
        listOfQuestions[2][4] = new JeopardyQuestion("Question Category 3, score 1000.", 1000);
        listOfQuestions[3][4] = new JeopardyQuestion("Question Category 4, score 1000.", 1000);
        listOfQuestions[4][4] = new JeopardyQuestion("Question Category 5, score 1000.", 1000);
        listOfQuestions[5][4] = new JeopardyQuestion("Question Category 6, score 1000.", 1000);


    }

    public void run() {
        jeopardyUI.showOverview();
    }

    @Override
    public void onOverviewButtonClicked(int x, int y) {
        jeopardyUI.showQuestion(listOfQuestions[x][y]);
        jeopardyUI.markQuestionAsCompleted(x, y);
    }

    @Override
    public void onQuestionCompletedClicked(JeopardyQuestion jeopardyQuestion, int team) {
        // TODO: score aktualisieren und layout der scores aktualisieren
        if (team == 1) {
            pointsTeam1 += jeopardyQuestion.getQuestionScore();
        } else if (team == 2) {
            pointsTeam2 += jeopardyQuestion.getQuestionScore();
        }

        jeopardyUI.updateScore(pointsTeam1, pointsTeam2);
        jeopardyUI.showOverview();
    }

}
