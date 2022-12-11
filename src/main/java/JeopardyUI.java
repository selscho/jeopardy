import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JeopardyUI {
    JFrame frame = new JFrame();
    CardLayout cardLayout = new CardLayout();
    JPanel views = new JPanel(cardLayout);
    JPanel tableOfCategoriesPanel = new JPanel();
    JPanel questionPanel = new JPanel();
    final static String TABLE_OF_CATEGORIES = "table of categories";
    final static String QUESTION = "question";

    //final static int question11Score = 200;
    //final static int question21Score = 400;

    //private int pointsTeam1 = 0;
    //private int pointsTeam2 = 0;
    // TODO: methode, die scores rein schreibt und die JTextField-Groesse aktualisiert
    JTextField scoreTeam1Field = new JTextField();
    JTextField scoreTeam2Field = new JTextField();
//    JTextField scoreTeam1Field = new JTextField(String.valueOf(pointsTeam1));
//    JTextField scoreTeam2Field = new JTextField(String.valueOf(pointsTeam2));

    JeopardyUIListener jeopardyUIListener;

    JeopardyUI(JeopardyUIListener jeopardyUIListener){
        this.jeopardyUIListener = jeopardyUIListener;
        //JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createOverview();
        createQuestionView();

        views.add(tableOfCategoriesPanel, TABLE_OF_CATEGORIES);
        views.add(questionPanel, QUESTION);
        frame.add(views);

        frame.setVisible(true);
    }

    private void createOverview(){
        //JPanel tableOfCategoriesPanel = new JPanel();
        tableOfCategoriesPanel.setLayout(new BoxLayout(tableOfCategoriesPanel, BoxLayout.Y_AXIS));

        // create grid with categories and question-scores
        JPanel tableOfCategoriesGrid = new JPanel();
        int numberOfCategories = 6;
        tableOfCategoriesGrid.setLayout(new GridLayout(0, numberOfCategories));
        tableOfCategoriesPanel.add(tableOfCategoriesGrid);

        tableOfCategoriesGrid.add(new JLabel("Category 1"));
        tableOfCategoriesGrid.add(new JLabel("Category 2"));
        tableOfCategoriesGrid.add(new JLabel("Category 3"));
        tableOfCategoriesGrid.add(new JLabel("Category 4"));
        tableOfCategoriesGrid.add(new JLabel("Category 5"));
        tableOfCategoriesGrid.add(new JLabel("Category 6"));

        tableOfCategoriesGrid.add(createButton(0, 0, "200"));
        tableOfCategoriesGrid.add(createButton(1, 0, "200"));
        tableOfCategoriesGrid.add(createButton(2, 0, "200"));
        tableOfCategoriesGrid.add(createButton(3, 0, "200"));
        tableOfCategoriesGrid.add(createButton(4, 0, "200"));
        tableOfCategoriesGrid.add(createButton(5, 0, "200"));

        tableOfCategoriesGrid.add(createButton(0, 1, "400"));
        tableOfCategoriesGrid.add(createButton(1, 1, "400"));
        tableOfCategoriesGrid.add(createButton(2, 1, "400"));
        tableOfCategoriesGrid.add(createButton(3, 1, "400"));
        tableOfCategoriesGrid.add(createButton(4, 1, "400"));
        tableOfCategoriesGrid.add(createButton(5, 1, "400"));

        tableOfCategoriesGrid.add(createButton(0, 2, "600"));
        tableOfCategoriesGrid.add(createButton(1, 2, "600"));
        tableOfCategoriesGrid.add(createButton(2, 2, "600"));
        tableOfCategoriesGrid.add(createButton(3, 2, "600"));
        tableOfCategoriesGrid.add(createButton(4, 2, "600"));
        tableOfCategoriesGrid.add(createButton(5, 2, "600"));

        tableOfCategoriesGrid.add(createButton(0, 3, "800"));
        tableOfCategoriesGrid.add(createButton(1, 3, "800"));
        tableOfCategoriesGrid.add(createButton(2, 3, "800"));
        tableOfCategoriesGrid.add(createButton(3, 3, "800"));
        tableOfCategoriesGrid.add(createButton(4, 3, "800"));
        tableOfCategoriesGrid.add(createButton(5, 3, "800"));

        tableOfCategoriesGrid.add(createButton(0, 4, "1000"));
        tableOfCategoriesGrid.add(createButton(1, 4, "1000"));
        tableOfCategoriesGrid.add(createButton(2, 4, "1000"));
        tableOfCategoriesGrid.add(createButton(3, 4, "1000"));
        tableOfCategoriesGrid.add(createButton(4, 4, "1000"));
        tableOfCategoriesGrid.add(createButton(5, 4, "1000"));

        // create score bar
        JPanel scoreBarPanel = new JPanel();
        scoreBarPanel.setLayout(new BoxLayout(scoreBarPanel, BoxLayout.X_AXIS));

        var team1 = new JTextField("Team 1:");
        team1.setMaximumSize(team1.getPreferredSize());
        scoreBarPanel.add(team1);

        //var pointsTeam1Field = new JTextField(String.valueOf(pointsTeam1));
        scoreTeam1Field.setMaximumSize(scoreTeam1Field.getPreferredSize());
        scoreBarPanel.add(scoreTeam1Field);

        var team2 = new JTextField("Team 2:");
        team2.setMaximumSize(team2.getPreferredSize());
        scoreBarPanel.add(team2);

        //var pointsTeam2Field = new JTextField(String.valueOf(pointsTeam2));
        scoreTeam2Field.setMaximumSize(scoreTeam2Field.getPreferredSize());
        scoreBarPanel.add(scoreTeam2Field);

        tableOfCategoriesPanel.add(scoreBarPanel);

        //frame.setVisible(true);
    }

    // TODO: ohne Argument: Platzhalter einfügen
    private void createQuestionView(){
        //JPanel questionPanel = new JPanel();

        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        // TODO: border nicht hardcodieren, sondern abhängig von der bildschirmauflösung machen
        questionPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));

        // display question
        JTextArea questionArea = new JTextArea("Hier steht dann eine Frage");
        questionArea.setLineWrap(true);
        questionPanel.add(questionArea);

        // create team-buttons to be able to assign score
        JPanel teamButtonsPanel = new JPanel();
        teamButtonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // TODO: create a ButtonGroup object, so that only team1 or team2 can be selected
        var team1Button = new JRadioButton("Team 1");
        var team2Button = new JRadioButton("Team 2");
        teamButtonsPanel.setLayout(new BoxLayout(teamButtonsPanel, BoxLayout.X_AXIS));
        teamButtonsPanel.add(team1Button);
        teamButtonsPanel.add(team2Button);
        questionPanel.add(teamButtonsPanel);

        // create ready-button
        JPanel readyButtonPanel = new JPanel();
        readyButtonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        readyButtonPanel.setLayout(new BoxLayout(readyButtonPanel, BoxLayout.X_AXIS));
        JButton readyButton = new JButton("Fertig");
        readyButtonPanel.add(readyButton);
        readyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jeopardyUIListener.onQuestionCompletedClicked();
            }
        });
//        readyButton.addActionListener(actionEvent -> {
//            if (team1Button.isSelected()) {
//                pointsTeam1 += jeopardyQuestion.getQuestionScore();
//                scoreTeam1Field.setText(String.valueOf(pointsTeam1));
//                scoreTeam1Field.setMaximumSize(scoreTeam1Field.getPreferredSize());
//            }
//            if (team2Button.isSelected()) {
//                pointsTeam2 += jeopardyQuestion.getQuestionScore();
//                scoreTeam2Field.setText(String.valueOf(pointsTeam2));
//                scoreTeam2Field.setMaximumSize(scoreTeam2Field.getPreferredSize());
//            }
//            cardLayout.show(views, TABLE_OF_CATEGORIES);
//        });
        questionPanel.add(readyButtonPanel);

        //frame.setVisible(true);
    }

    public void showOverview() {
        cardLayout.show(views, TABLE_OF_CATEGORIES);
    }

    public void showQuestion() {
        cardLayout.show(views, QUESTION);
    }

    private JButton createButton(int x, int y, String score) {
        JButton button = new JButton(score);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jeopardyUIListener.onOverviewButtonClicked(x, y);
            }
        });

        return button;
    }
}
