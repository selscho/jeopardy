import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application implements ActionListener {
    CardLayout cardLayout = new CardLayout();
    JPanel views = new JPanel(cardLayout);
    final static String TABLE_OF_CATEGORIES = "table of categories";
    final static String QUESTION = "question";

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
        int numberOfCategories = 6;
        tableOfCategoriesPanel.setLayout(new GridLayout(0, numberOfCategories));

        tableOfCategoriesPanel.add(new JLabel("Category 1"));
        tableOfCategoriesPanel.add(new JLabel("Category 2"));
        tableOfCategoriesPanel.add(new JLabel("Category 3"));
        tableOfCategoriesPanel.add(new JLabel("Category 4"));
        tableOfCategoriesPanel.add(new JLabel("Category 5"));
        tableOfCategoriesPanel.add(new JLabel("Category 6"));

        JButton b11 = new JButton("200");
        b11.addActionListener(this);
        tableOfCategoriesPanel.add(b11);

        tableOfCategoriesPanel.add(new JButton("200"));
        tableOfCategoriesPanel.add(new JButton("200"));
        tableOfCategoriesPanel.add(new JButton("200"));
        tableOfCategoriesPanel.add(new JButton("200"));
        tableOfCategoriesPanel.add(new JButton("200"));

        tableOfCategoriesPanel.add(new JButton("400"));
        tableOfCategoriesPanel.add(new JButton("400"));
        tableOfCategoriesPanel.add(new JButton("400"));
        tableOfCategoriesPanel.add(new JButton("400"));
        tableOfCategoriesPanel.add(new JButton("400"));
        tableOfCategoriesPanel.add(new JButton("400"));

        tableOfCategoriesPanel.add(new JButton("600"));
        tableOfCategoriesPanel.add(new JButton("600"));
        tableOfCategoriesPanel.add(new JButton("600"));
        tableOfCategoriesPanel.add(new JButton("600"));
        tableOfCategoriesPanel.add(new JButton("600"));
        tableOfCategoriesPanel.add(new JButton("600"));

        tableOfCategoriesPanel.add(new JButton("800"));
        tableOfCategoriesPanel.add(new JButton("800"));
        tableOfCategoriesPanel.add(new JButton("800"));
        tableOfCategoriesPanel.add(new JButton("800"));
        tableOfCategoriesPanel.add(new JButton("800"));
        tableOfCategoriesPanel.add(new JButton("800"));

        tableOfCategoriesPanel.add(new JButton("1000"));
        tableOfCategoriesPanel.add(new JButton("1000"));
        tableOfCategoriesPanel.add(new JButton("1000"));
        tableOfCategoriesPanel.add(new JButton("1000"));
        tableOfCategoriesPanel.add(new JButton("1000"));
        tableOfCategoriesPanel.add(new JButton("1000"));

        // create question layout
//        GridBagLayout gridBagLayout = new GridBagLayout();
//        //gridBagLayout.columnWidths = new int[] {10, 10, 20, 10, 10};
//        questionPanel.setLayout(gridBagLayout);
//
//        JTextArea questionArea = new JTextArea("Hier steht eine Frage. Eine suuuuper lange Frage: Wie war das nochmal? " +
//                "Wie soll ich nur anfangen? Niemals anfangen aufzuhören, aber wie, wenn ich wünschte, es wäre zu Ende? " +
//                "Und was ist „es“ überhaupt? Wie soll ich das erklären, ohne von allen, nun ja, sagen wir, " +
//                "als „verrückt“ oder „geisteskrank“ abgestempelt zu werden… Ich werde es versuchen, aber dazu müssen " +
//                "wir eine kleine Reise in die Vergangenheit unternehmen. Wobei sich hier schon wieder die Frage stellt:" +
//                " „Was ist Vergangenheit überhaupt?“");
//        GridBagConstraints questionAreaConstraints = new GridBagConstraints();
//        questionAreaConstraints.gridx = 1;
//        questionAreaConstraints.gridy = 0;
//        questionAreaConstraints.gridwidth = 3;
//        questionAreaConstraints.gridheight = 1;
//        questionAreaConstraints.weightx = 0.6;
//        //questionAreaConstraints.fill = GridBagConstraints.BOTH;
//        //questionAreaConstraints.anchor = GridBagConstraints.CENTER;
//        //gridBagConstraints.weightx = weightx;
//        //gridBagConstraints.weighty = weighty;
//        gridBagLayout.setConstraints(questionArea, questionAreaConstraints);
//        questionPanel.add(questionArea, questionAreaConstraints);

        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));

        JTextArea questionArea = new JTextArea("Hier steht eine Frage. Eine suuuuper lange Frage: Wie war das nochmal? " +
                "Wie soll ich nur anfangen? Niemals anfangen aufzuhören, aber wie, wenn ich wünschte, es wäre zu Ende? " +
                "Und was ist „es“ überhaupt? Wie soll ich das erklären, ohne von allen, nun ja, sagen wir, " +
                "als „verrückt“ oder „geisteskrank“ abgestempelt zu werden… Ich werde es versuchen, aber dazu müssen " +
                "wir eine kleine Reise in die Vergangenheit unternehmen. Wobei sich hier schon wieder die Frage stellt:" +
                " „Was ist Vergangenheit überhaupt?“");
        questionArea.setLineWrap(true);
        questionPanel.add(questionArea);

        JPanel teamButtons = new JPanel();
        JButton team1Button = new JButton("Team 1");
        JButton team2Button = new JButton("Team 2");
        teamButtons.setLayout(new BoxLayout(teamButtons, BoxLayout.X_AXIS));
        teamButtons.add(team1Button);
        teamButtons.add(team2Button);
        questionPanel.add(teamButtons);

        JButton readyButton = new JButton("Fertig");
        questionPanel.add(readyButton);

//        GridBagConstraints c0 = new GridBagConstraints();
//        GridBagConstraints c1 = new GridBagConstraints();
//        GridBagConstraints c2 = new GridBagConstraints();
//        GridBagConstraints c3 = new GridBagConstraints();
//        GridBagConstraints c4 = new GridBagConstraints();
//        GridBagConstraints c5 = new GridBagConstraints();
//
////        JTextArea emptyArea = new JTextArea("    ");
////        c0.gridx = 0;
////        c0.gridy = 0;
////        c0.gridwidth = 1;
////        c0.weightx = 0.5;
////        c0.fill = GridBagConstraints.HORIZONTAL;
////        questionPanel.add(emptyArea, c0);
//
//
//        JTextArea questionArea = new JTextArea("Hier steht eine Frage. Eine suuuuper lange Frage: Wie war das nochmal? " +
//                "Wie soll ich nur anfangen? Niemals anfangen aufzuhören, aber wie, wenn ich wünschte, es wäre zu Ende? " +
//                "Und was ist „es“ überhaupt? Wie soll ich das erklären, ohne von allen, nun ja, sagen wir, " +
//                "als „verrückt“ oder „geisteskrank“ abgestempelt zu werden… Ich werde es versuchen, aber dazu müssen " +
//                "wir eine kleine Reise in die Vergangenheit unternehmen. Wobei sich hier schon wieder die Frage stellt:" +
//                " „Was ist Vergangenheit überhaupt?“");
//        questionArea.setLineWrap(true);
//        c4.fill = GridBagConstraints.HORIZONTAL;
//        c4.anchor = GridBagConstraints.CENTER;
//        //c4.ipadx = 80;
//        //c4.ipady = 40;      //make this component tall
//        c4.weightx = 0.6;
//        c4.gridwidth = 3;
//        c4.gridx = 1;
//        c4.gridy = 0;
//        questionPanel.add(questionArea, c4);
//
////        JButton button1 = new JButton("Button 1");
////        c1.weightx = 0.5;
////        c1.fill = GridBagConstraints.HORIZONTAL;
////        c1.gridx = 0;
////        c1.gridy = 1;
////        questionPanel.add(button1, c1);
//
//        JButton button2 = new JButton("Button 2");
//        c2.fill = GridBagConstraints.HORIZONTAL;
//        c2.weightx = 0.5;
//        c2.gridx = 1;
//        c2.gridy = 1;
//        questionPanel.add(button2, c2);
//
//        JButton button3 = new JButton("Button 3");
//        c3.fill = GridBagConstraints.HORIZONTAL;
//        c3.weightx = 0.5;
//        c3.gridx = 3;
//        c3.gridy = 1;
//        questionPanel.add(button3, c3);
//
//        JButton button5 = new JButton("Fertig");
//        c5.fill = GridBagConstraints.HORIZONTAL;
//        //c5.ipady = 0;       //reset to default
//        c5.weightx = 0.2;
//        c5.weighty = 1.0;   //request any extra vertical space
//        c5.anchor = GridBagConstraints.PAGE_END; //bottom of space
//        //c5.insets = new Insets(10, 0, 0, 0);  //top padding
//        c5.gridx = 4;       //aligned with button 2
//        c5.gridwidth = 1;   //2 columns wide
//        c5.gridy = 2;       //third row
//        questionPanel.add(button5, c5);


        //JButton nextButton = new JButton("Weiter");
        //nextButton.addActionListener(actionEvent -> cardLayout.show(views, TABLE_OF_CATEGORIES));
        //questionPanel.add(nextButton);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // TODO: cardlayout, um frage-fenster über grid legen zu können
        cardLayout.show(views, QUESTION);
    }

    static void addComponent(JPanel container, GridBagLayout gridBagLayout,
                             Component component, int x, int y,
                             int width, int height,
                             double weightx, double weighty) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        //gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        gridBagConstraints.gridwidth = width;
        gridBagConstraints.gridheight = height;
        gridBagConstraints.weightx = weightx;
        gridBagConstraints.weighty = weighty;
        gridBagLayout.setConstraints(component, gridBagConstraints);
        container.add(component);
    }
}
