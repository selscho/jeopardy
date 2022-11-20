import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application implements ActionListener {

    public void run(){
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int numberOfCategories = 6;
        frame.setLayout(new GridLayout(0, numberOfCategories));

        frame.add(new JLabel("Category 1"));
        frame.add(new JLabel("Category 2"));
        frame.add(new JLabel("Category 3"));
        frame.add(new JLabel("Category 4"));
        frame.add(new JLabel("Category 5"));
        frame.add(new JLabel("Category 6"));

        JButton b11 = new JButton("200");
        b11.addActionListener(this);
        frame.add(b11);

        frame.add(new JButton("200"));
        frame.add(new JButton("200"));
        frame.add(new JButton("200"));
        frame.add(new JButton("200"));
        frame.add(new JButton("200"));

        frame.add(new JButton("400"));
        frame.add(new JButton("400"));
        frame.add(new JButton("400"));
        frame.add(new JButton("400"));
        frame.add(new JButton("400"));
        frame.add(new JButton("400"));

        frame.add(new JButton("600"));
        frame.add(new JButton("600"));
        frame.add(new JButton("600"));
        frame.add(new JButton("600"));
        frame.add(new JButton("600"));
        frame.add(new JButton("600"));

        frame.add(new JButton("800"));
        frame.add(new JButton("800"));
        frame.add(new JButton("800"));
        frame.add(new JButton("800"));
        frame.add(new JButton("800"));
        frame.add(new JButton("800"));

        frame.add(new JButton("1000"));
        frame.add(new JButton("1000"));
        frame.add(new JButton("1000"));
        frame.add(new JButton("1000"));
        frame.add(new JButton("1000"));
        frame.add(new JButton("1000"));

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // TODO: cardlayout, um frage-fenster über grid legen zu können
    }
}
