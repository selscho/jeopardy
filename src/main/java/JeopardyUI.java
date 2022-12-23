import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JeopardyUI {
    JFrame frame = new JFrame();
    CardLayout cardLayout = new CardLayout();
    JPanel views = new JPanel(cardLayout);
    JPanel tableOfCategoriesPanel = new JPanel();
    JPanel tableOfCategoriesGrid = new JPanel();
    int numberOfCategories = 6;
    float fontSize = 25;
    JPanel questionPanel = new JPanel();
    private JTextArea questionArea = new JTextArea("");
    private JeopardyQuestion activeQuestion = new JeopardyQuestion("?", 0);
    //private JButton readyButton = new JButton("Fertig");
    final static String TABLE_OF_CATEGORIES = "table of categories";
    final static String QUESTION = "question";
    JTextField scoreTeam1Field = new JTextField("0");
    JTextField scoreTeam2Field = new JTextField("0");
    JRadioButton selectedButton = null;

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
        //JPanel tableOfCategoriesGrid = new JPanel();
        tableOfCategoriesGrid.setLayout(new GridLayout(0, numberOfCategories));
        tableOfCategoriesPanel.add(tableOfCategoriesGrid);

        for (int c=1; c < 7; c++) {
            var label = new JLabel("Category " + c, SwingConstants.CENTER);
            label.setFont(label.getFont().deriveFont(fontSize));
            tableOfCategoriesGrid.add(label);
        }

//        tableOfCategoriesGrid.add(new JLabel("Category 1", SwingConstants.CENTER));
//        tableOfCategoriesGrid.add(new JLabel("Category 2", SwingConstants.CENTER));
//        tableOfCategoriesGrid.add(new JLabel("Category 3", SwingConstants.CENTER));
//        tableOfCategoriesGrid.add(new JLabel("Category 4", SwingConstants.CENTER));
//        tableOfCategoriesGrid.add(new JLabel("Category 5", SwingConstants.CENTER));
//        tableOfCategoriesGrid.add(new JLabel("Category 6", SwingConstants.CENTER));

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
        //scoreBarPanel.setPreferredSize(new Dimension(200, 1080/14));

        var team1 = new JTextField("Team 1:");
        team1.setFont(team1.getFont().deriveFont(fontSize));
        team1.setMaximumSize(team1.getPreferredSize());
        scoreBarPanel.add(team1);

        //var pointsTeam1Field = new JTextField(String.valueOf(pointsTeam1));
        scoreTeam1Field.setFont(scoreTeam1Field.getFont().deriveFont(fontSize));
        scoreTeam1Field.setMaximumSize(scoreTeam1Field.getPreferredSize());
        scoreBarPanel.add(scoreTeam1Field);

        var team2 = new JTextField("Team 2:");
        team2.setFont(team2.getFont().deriveFont(fontSize));
        team2.setMaximumSize(team2.getPreferredSize());
        scoreBarPanel.add(team2);

        //var pointsTeam2Field = new JTextField(String.valueOf(pointsTeam2));
        scoreTeam2Field.setFont(scoreTeam2Field.getFont().deriveFont(fontSize));
        scoreTeam2Field.setMaximumSize(scoreTeam2Field.getPreferredSize());
        scoreBarPanel.add(scoreTeam2Field);

        tableOfCategoriesPanel.add(scoreBarPanel);

        //frame.setVisible(true);
    }

    // TODO: ohne Argument: Platzhalter einfügen
    private void createQuestionView(){
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        // TODO: border nicht hardcodieren, sondern abhängig von der bildschirmauflösung machen
        questionPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));

        // display question
        questionArea.setLineWrap(true);
        questionPanel.add(questionArea);

        // create team-buttons to be able to assign score
        JPanel teamButtonsPanel = new JPanel();
        teamButtonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // add buttonGroup, so that only team 1 OR team 2 can be selected
        ButtonGroup buttonGroup = new ButtonGroup();

        var team1Button = new JRadioButton("Team 1");
        team1Button.setFont(team1Button.getFont().deriveFont(fontSize));
        buttonGroup.add(team1Button);
        team1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (selectedButton == team1Button) {
                    buttonGroup.clearSelection();
                    selectedButton = null;
                } else {
                    selectedButton = team1Button;
                }
            }
        });

        var team2Button = new JRadioButton("Team 2");
        team2Button.setFont(team2Button.getFont().deriveFont(fontSize));
        buttonGroup.add(team2Button);
        team2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (selectedButton == team2Button) {
                    buttonGroup.clearSelection();
                    selectedButton = null;
                } else {
                    selectedButton = team2Button;
                }
            }
        });

        teamButtonsPanel.setLayout(new BoxLayout(teamButtonsPanel, BoxLayout.X_AXIS));
        teamButtonsPanel.add(team1Button);
        teamButtonsPanel.add(team2Button);
        questionPanel.add(teamButtonsPanel);


        // create ready-button
        JPanel readyButtonPanel = new JPanel();
        readyButtonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        readyButtonPanel.setLayout(new BoxLayout(readyButtonPanel, BoxLayout.X_AXIS));
        JButton readyButton = new JButton("Fertig");
        readyButton.setFont(readyButton.getFont().deriveFont(fontSize));
        readyButtonPanel.add(readyButton);
        readyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int team = 0;
                if (team1Button.isSelected()) {
                    team = 1;
                } else if (team2Button.isSelected()) {
                    team = 2;
                }
                jeopardyUIListener.onQuestionCompletedClicked(activeQuestion, team);
                buttonGroup.clearSelection();
            }
        });

        questionPanel.add(readyButtonPanel);
    }

    public void showOverview() {
        cardLayout.show(views, TABLE_OF_CATEGORIES);
    }

    public void showQuestion(JeopardyQuestion jeopardyQuestion) {
        cardLayout.show(views, QUESTION);
        questionArea.setText(jeopardyQuestion.getQuestion());
        activeQuestion = jeopardyQuestion;
    }

    public void updateScore(int scoreTeam1, int scoreTeam2){
        scoreTeam1Field.setText(String.valueOf(scoreTeam1));
        scoreTeam1Field.setMaximumSize(scoreTeam1Field.getPreferredSize());

        scoreTeam2Field.setText(String.valueOf(scoreTeam2));
        scoreTeam2Field.setMaximumSize(scoreTeam2Field.getPreferredSize());
    }

    public void markQuestionAsCompleted(int x, int y){
        JButton button = (JButton) tableOfCategoriesGrid.getComponent(numberOfCategories + (y * numberOfCategories + x));
        button.setEnabled(false);
    }

    private JButton createButton(int x, int y, String score) {
        JButton button = new JButton(score);
        button.setFont(button.getFont().deriveFont(fontSize));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jeopardyUIListener.onOverviewButtonClicked(x, y);
            }
        });

        return button;
    }
}
