import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application implements ActionListener {
    CardLayout cardLayout = new CardLayout();
    JPanel views = new JPanel(cardLayout);
    final static String TABLE_OF_CATEGORIES = "table of categories";
    final static String QUESTION = "question";

    public void run(){
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel tableOfCategories = new JPanel();
        JPanel question = new JPanel();

        views.add(tableOfCategories, TABLE_OF_CATEGORIES);
        views.add(question, QUESTION);
        frame.add(views);

        // create table of categories layout
        int numberOfCategories = 6;
        tableOfCategories.setLayout(new GridLayout(0, numberOfCategories));

        tableOfCategories.add(new JLabel("Category 1"));
        tableOfCategories.add(new JLabel("Category 2"));
        tableOfCategories.add(new JLabel("Category 3"));
        tableOfCategories.add(new JLabel("Category 4"));
        tableOfCategories.add(new JLabel("Category 5"));
        tableOfCategories.add(new JLabel("Category 6"));

        JButton b11 = new JButton("200");
        b11.addActionListener(this);
        tableOfCategories.add(b11);

        tableOfCategories.add(new JButton("200"));
        tableOfCategories.add(new JButton("200"));
        tableOfCategories.add(new JButton("200"));
        tableOfCategories.add(new JButton("200"));
        tableOfCategories.add(new JButton("200"));

        tableOfCategories.add(new JButton("400"));
        tableOfCategories.add(new JButton("400"));
        tableOfCategories.add(new JButton("400"));
        tableOfCategories.add(new JButton("400"));
        tableOfCategories.add(new JButton("400"));
        tableOfCategories.add(new JButton("400"));

        tableOfCategories.add(new JButton("600"));
        tableOfCategories.add(new JButton("600"));
        tableOfCategories.add(new JButton("600"));
        tableOfCategories.add(new JButton("600"));
        tableOfCategories.add(new JButton("600"));
        tableOfCategories.add(new JButton("600"));

        tableOfCategories.add(new JButton("800"));
        tableOfCategories.add(new JButton("800"));
        tableOfCategories.add(new JButton("800"));
        tableOfCategories.add(new JButton("800"));
        tableOfCategories.add(new JButton("800"));
        tableOfCategories.add(new JButton("800"));

        tableOfCategories.add(new JButton("1000"));
        tableOfCategories.add(new JButton("1000"));
        tableOfCategories.add(new JButton("1000"));
        tableOfCategories.add(new JButton("1000"));
        tableOfCategories.add(new JButton("1000"));
        tableOfCategories.add(new JButton("1000"));

        // create question layout
        JButton nextButton = new JButton("Weiter");
        nextButton.addActionListener(actionEvent -> cardLayout.show(views, TABLE_OF_CATEGORIES));
        question.add(nextButton);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // TODO: cardlayout, um frage-fenster über grid legen zu können
        cardLayout.show(views, QUESTION);
    }
}
