// Write an AWT program to create a push button, arrange them using
// FlowLayout manager, and set the background color for the frame depending
// on the button clicked by the user.

import java.awt.*;
import java.awt.event.*;

class P9_2 extends Frame implements ActionListener {
    Button b1, b2, b3;

    ColorDemo() {
        setTitle("Color Demo");
        setSize(500, 400);
        setLayout(new FlowLayout());

        b1 = new Button("Green");
        b2 = new Button("Blue");
        b3 = new Button("Yellow");

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setBackground(Color.YELLOW);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setBackground(Color.GREEN);
        } else if (e.getSource() == b2) {
            setBackground(Color.BLUE);
        } else if (e.getSource() == b3) {
            setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        new ColorDemo();
    }
}