import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application implements JeopardyUIListener {
    JeopardyUI jeopardyUI = new JeopardyUI(this);
    String[] listOfCategories = new String[6];
    JeopardyQuestion[][] listOfQuestions = new JeopardyQuestion[6][5];

    private int pointsTeam1 = 0;
    private int pointsTeam2 = 0;

    public Application(){
        // initialise array of categories
        listOfCategories[0] = "Category 1";
        listOfCategories[1] = "Category 2";
        listOfCategories[2] = "Category 3";
        listOfCategories[3] = "Category 4";
        listOfCategories[4] = "Category 5";
        listOfCategories[5] = "Category 6";

        // initialise array of questions
        listOfQuestions[0][0] = new JeopardyQuestion("Wie lautet der Name des Bürgermeisters von Buchloe?", 200);
        listOfQuestions[1][0] = new JeopardyQuestion("Was bedeutet das Wort Brezn?", 200);
        listOfQuestions[2][0] = new JeopardyQuestion("Du hast eine gefüllte Streichholzschachtel und kommst in einen leeren, kalten Raum, in dem sich nur ein Kohleofen, eine Petroleumlampe und ein Kamin steht. Was zündest du zuerst an?", 200);
        listOfQuestions[3][0] = new JeopardyQuestion("Welcher Fahrer hat die meisten Formel-1-Meisterschaften gewonnen?", 200);
        listOfQuestions[4][0] = new JeopardyQuestion("Wie viel wiegt eine Ein-Cent-Münze?", 200);
        listOfQuestions[5][0] = new JeopardyQuestion("Wie viele Tage dauert es, bis die Erde die Sonne umkreist?", 200);

        listOfQuestions[0][1] = new JeopardyQuestion("Was bedeutet Buchloe?", 400);
        listOfQuestions[1][1] = new JeopardyQuestion("Wie heißt der höchste Berg in Bayern?", 400);
        listOfQuestions[2][1] = new JeopardyQuestion("In welchen Zug passt nur ein Mensch, egal wie man sich anstrengt?", 400);
        listOfQuestions[3][1] = new JeopardyQuestion("Wie viele Tasten hat ein klassisches Klavier?", 400);
        listOfQuestions[4][1] = new JeopardyQuestion("Wie wird der 100. Hochzeitstag genannt?", 400);
        listOfQuestions[5][1] = new JeopardyQuestion("Was ist die Hauptstadt von Kanada?", 400);

        listOfQuestions[0][2] = new JeopardyQuestion("Auf wie viel Meter über Null liegt Buchloe?", 600);
        listOfQuestions[1][2] = new JeopardyQuestion("Die älteste Stadt in Bayern ist?", 600);
        listOfQuestions[2][2] = new JeopardyQuestion("Was schwimmt in einem See und fängt mit Z an?", 600);
        listOfQuestions[3][2] = new JeopardyQuestion("Nenne die meistverkaufte Buchreihe des 21. Jahrhunderts?", 600);
        listOfQuestions[4][2] = new JeopardyQuestion("Wie lang ist die Küste Mecklenburg-Vorpommerns?", 600);
        listOfQuestions[5][2] = new JeopardyQuestion("Wie hieß die türkische Stadt Istanbul bis 1923?", 600);

        listOfQuestions[0][3] = new JeopardyQuestion("Was ist die Partnerstadt von Buchloe?", 800);
        listOfQuestions[1][3] = new JeopardyQuestion("Wie viele Regierungsbezirke gibt es in Bayern?", 800);
        listOfQuestions[2][3] = new JeopardyQuestion("Welche Vögel legen niemals Eier?", 800);
        listOfQuestions[3][3] = new JeopardyQuestion("Wie heißt der freche Kobold von Meister Eder?", 800);
        listOfQuestions[4][3] = new JeopardyQuestion("Wie viele Monde hat der Jupiter?", 800);
        listOfQuestions[5][3] = new JeopardyQuestion("Wo ist der tiefste natürliche Ort auf dem Planeten Erde?", 800);

        listOfQuestions[0][4] = new JeopardyQuestion("Das Buchloer Wappen besteht aus den Farben silber und rot. Fuer was stehen diese Farben?", 1000);
        listOfQuestions[1][4] = new JeopardyQuestion("Sind Panther im bayrischen Wappen dargestellt und wenn ja wieviele?", 1000);
        listOfQuestions[2][4] = new JeopardyQuestion("Was antwortet in allen Sprachen? Was spricht ohne Mund? Was hört ohne Ohren?", 1000);
        listOfQuestions[3][4] = new JeopardyQuestion("Wann wurde Netflix gegründet?", 1000);
        listOfQuestions[4][4] = new JeopardyQuestion("Wie viel Ladung geht im Hamburger Hafen im Jahr über die Kaikanten?", 1000);
        listOfQuestions[5][4] = new JeopardyQuestion("Wie viele Streifen sind auf der US-Flagge?", 1000);


    }

    public void run() {
        jeopardyUI.showOverview();
    }

    @Override
    public void onOverviewButtonClicked(int x, int y) {
        jeopardyUI.setQuestionTitle(listOfQuestions[x][y].getQuestionScore(), listOfCategories[x]);
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
