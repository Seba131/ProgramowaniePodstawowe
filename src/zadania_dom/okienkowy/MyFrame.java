package zadania_dom.okienkowy;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocation(50,50);
        setLayout(new FlowLayout());

        add(new JButton("Przycisk 1"));
        add(new JButton("Przycisk 2"));
        add(new JButton("Przycisk 3"));

        setVisible(true);
    }
}
