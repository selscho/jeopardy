import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Jeopardy {

    public static void main(String[] args){
        System.out.println("Hello world!");

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

        frame.add(new JButton("200"));
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
}
