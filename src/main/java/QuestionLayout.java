import javax.swing.*;

public class QuestionLayout {

    QuestionLayout(JeopardyQuestion jeopardyquestion, Application application){
        JPanel questionPanel = new JPanel();

        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        // TODO: border nicht hardcodieren, sondern abhängig von der bildschirmauflösung machen
        questionPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));

        JTextArea questionArea = new JTextArea(jeopardyquestion.getQuestion());
        questionArea.setLineWrap(true);
        questionPanel.add(questionArea);

        JPanel teamButtonsPanel = new JPanel();
        teamButtonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // TODO: create a ButtonGroup object, so that only team1 or team2 can be selected
        var team1Button = new JRadioButton("Team 1");
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
                application.setPointsTeam1(application.getPointsTeam1() + jeopardyquestion.getQuestionScore());
                application.pointsTeam1Field.setText(String.valueOf(application.getPointsTeam1()));
                application.pointsTeam1Field.setMaximumSize(application.pointsTeam1Field.getPreferredSize());
            }
            if (team2Button.isSelected()) {
                pointsTeam2 += question11Score;
                pointsTeam2Field.setText(String.valueOf(pointsTeam2));
                pointsTeam2Field.setMaximumSize(pointsTeam2Field.getPreferredSize());
            }
            cardLayout.show(views, TABLE_OF_CATEGORIES);
        });
        questionPanel.add(readyButtonPanel);
    }
}
