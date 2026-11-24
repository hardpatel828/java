// Write an AWT program to create a choice menu with names of the IITs from
// where the user has to select any one IIT. The selected item must also be
// displayed in the frame.

import java.awt.*;
import java.awt.event.*;

class P9_3 extends Frame implements ItemListener {
    Choice c;
    Label l;

    ChoiceMenu() {
        setTitle("Choice menu");
        setSize(620, 300);
        setLayout(new FlowLayout());

        c = new Choice();
        c.add("IIT Indore");
        c.add("IIT Bombay");
        c.add("IIT Delhi");
        c.add("IIT Madras");
        c.add("IIT Kanpur");
        c.add("IIT Roorkee");

        l = new Label("Selected Institute: IIT Indore");

        add(c);
        add(l);

        c.addItemListener(this);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        l.setText("Selected Institute: " + c.getSelectedItem());
    }

    public static void main(String[] args) {
        new ChoiceMenu();
    }
}