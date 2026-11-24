// Write a Java Swing program to create two labels and two text fields for entering
// a name and password. The password types by the user in the text field are
// hidden. The entered name and password must also be displayed in the frame.
// The username and password must be validated and display the error message
// using JOptionPanel.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class P10 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1;

    LoginForm() {
        setTitle("Login Form");
        setSize(600, 500);
        setLayout(null);

        l1 = new JLabel("Enter Your Name");
        l1.setBounds(50, 100, 200, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(300, 100, 250, 40);
        add(t1);

        l2 = new JLabel("Enter Your Password");
        l2.setBounds(50, 170, 200, 30);
        add(l2);

        t2 = new JPasswordField();
        t2.setBounds(300, 170, 250, 40);
        add(t2);

        b1 = new JButton("Login");
        b1.setBounds(230, 250, 120, 40);
        add(b1);

        l3 = new JLabel("");
        l3.setBounds(50, 320, 500, 30);
        add(l3);

        l4 = new JLabel("");
        l4.setBounds(50, 350, 500, 30);
        add(l4);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String password = new String(t2.getPassword());

        if (name.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter username and password",
                "Alert", JOptionPane.WARNING_MESSAGE);
        } else if (name.equals("Ganpat") && password.equals("12345")) {
            l3.setText("Your user name is: " + name);
            l4.setText("Your password is: " + password);
        } else {
            JOptionPane.showMessageDialog(this,
                "Invalid username or password",
                "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}