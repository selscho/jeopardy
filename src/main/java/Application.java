import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application implements ActionListener {
    CardLayout cardLayout = new CardLayout();
    JPanel views = new JPanel(cardLayout);
    final static String TABLE_OF_CATEGORIES = "table of categories";
    final static String QUESTION = "question";

    final static int question11Score = 200;
    final static int question21Score = 400;

    int pointsTeam1 = 0;
    int pointsTeam2 = 0;

    public void run() {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel tableOfCategoriesPanel = new JPanel();
        JPanel questionPanel = new JPanel();

        views.add(tableOfCategoriesPanel, TABLE_OF_CATEGORIES);
        views.add(questionPanel, QUESTION);
        frame.add(views);

        // create table of categories layout
        tableOfCategoriesPanel.setLayout(new BoxLayout(tableOfCategoriesPanel, BoxLayout.Y_AXIS));

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

        JButton b11 = new JButton("200");
        b11.addActionListener(this);
        tableOfCategoriesGrid.add(b11);

        tableOfCategoriesGrid.add(new JButton("200"));
        tableOfCategoriesGrid.add(new JButton("200"));
        tableOfCategoriesGrid.add(new JButton("200"));
        tableOfCategoriesGrid.add(new JButton("200"));
        tableOfCategoriesGrid.add(new JButton("200"));

        JButton b21 = new JButton("400");
        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        tableOfCategoriesGrid.add(b21);

        tableOfCategoriesGrid.add(new JButton("400"));
        tableOfCategoriesGrid.add(new JButton("400"));
        tableOfCategoriesGrid.add(new JButton("400"));
        tableOfCategoriesGrid.add(new JButton("400"));
        tableOfCategoriesGrid.add(new JButton("400"));

        tableOfCategoriesGrid.add(new JButton("600"));
        tableOfCategoriesGrid.add(new JButton("600"));
        tableOfCategoriesGrid.add(new JButton("600"));
        tableOfCategoriesGrid.add(new JButton("600"));
        tableOfCategoriesGrid.add(new JButton("600"));
        tableOfCategoriesGrid.add(new JButton("600"));

        tableOfCategoriesGrid.add(new JButton("800"));
        tableOfCategoriesGrid.add(new JButton("800"));
        tableOfCategoriesGrid.add(new JButton("800"));
        tableOfCategoriesGrid.add(new JButton("800"));
        tableOfCategoriesGrid.add(new JButton("800"));
        tableOfCategoriesGrid.add(new JButton("800"));

        tableOfCategoriesGrid.add(new JButton("1000"));
        tableOfCategoriesGrid.add(new JButton("1000"));
        tableOfCategoriesGrid.add(new JButton("1000"));
        tableOfCategoriesGrid.add(new JButton("1000"));
        tableOfCategoriesGrid.add(new JButton("1000"));
        tableOfCategoriesGrid.add(new JButton("1000"));

        JPanel pointBarPanel = new JPanel();
        pointBarPanel.setLayout(new BoxLayout(pointBarPanel, BoxLayout.X_AXIS));

        var team1 = new JTextField("Team 1:");
        team1.setMaximumSize(team1.getPreferredSize());
        pointBarPanel.add(team1);

        var pointsTeam1Field = new JTextField(String.valueOf(pointsTeam1));
        pointsTeam1Field.setMaximumSize(pointsTeam1Field.getPreferredSize());
        pointBarPanel.add(pointsTeam1Field);

        var team2 = new JTextField("Team 2:");
        team2.setMaximumSize(team2.getPreferredSize());
        pointBarPanel.add(team2);

        var pointsTeam2Field = new JTextField(String.valueOf(pointsTeam2));
        pointsTeam2Field.setMaximumSize(pointsTeam2Field.getPreferredSize());
        pointBarPanel.add(pointsTeam2Field);

        tableOfCategoriesPanel.add(pointBarPanel);

        // create question panel layout
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        // TODO: border nicht hardcodieren, sondern abhängig von der bildschirmauflösung machen
        questionPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));

        JTextArea questionArea = new JTextArea("Hier steht eine Frage. Eine suuuuper lange Frage: Wie war das nochmal? " +
                "Wie soll ich nur anfangen? Niemals anfangen aufzuhören, aber wie, wenn ich wünschte, es wäre zu Ende? " +
                "Und was ist „es“ überhaupt? Wie soll ich das erklären, ohne von allen, nun ja, sagen wir, " +
                "als „verrückt“ oder „geisteskrank“ abgestempelt zu werden… Ich werde es versuchen, aber dazu müssen " +
                "wir eine kleine Reise in die Vergangenheit unternehmen. Wobei sich hier schon wieder die Frage stellt:" +
                " „Was ist Vergangenheit überhaupt?“");
        questionArea.setLineWrap(true);
        questionPanel.add(questionArea);

        JPanel teamButtonsPanel = new JPanel();
        teamButtonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        var team1Button = new JRadioButton("Team 1");
        // TODO: create a ButtonGroup object, so that only team1 or team2 can be selected
        var team2Button = new JRadioButton("Team 2");
        teamButtonsPanel.setLayout(new BoxLayout(teamButtonsPanel, BoxLayout.X_AXIS));
        teamButtonsPanel.add(team1Button);
        teamButtonsPanel.add(team2Button);
        questionPanel.add(teamButtonsPanel);

        JPanel readyButtonPanel = new JPanel();
        readyButtonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        readyButtonPanel.setLayout(new BoxLayout(readyButtonPanel, BoxLayout.X_AXIS));
        JButton readyButton = new JButton("Fertig");
        readyButtonPanel.add(readyButton);
        readyButton.addActionListener(actionEvent -> {
            if (team1Button.isSelected()) {
                pointsTeam1 += question11Score;
                pointsTeam1Field.setText(String.valueOf(pointsTeam1));
                pointsTeam1Field.setMaximumSize(pointsTeam1Field.getPreferredSize());
            }
            if (team2Button.isSelected()) {
                pointsTeam2 += question11Score;
                pointsTeam2Field.setText(String.valueOf(pointsTeam2));
                pointsTeam2Field.setMaximumSize(pointsTeam2Field.getPreferredSize());
            }
            cardLayout.show(views, TABLE_OF_CATEGORIES);
        });
        questionPanel.add(readyButtonPanel);


        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // TODO: cardlayout, um frage-fenster über grid legen zu können
        cardLayout.show(views, QUESTION);
    }

}
