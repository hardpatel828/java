// Write an AWT program to draw a smiling face using the method of Graphics
// class.

import java.awt.*;

class P9_1 extends Frame {
    public Smileface() {
        setTitle("Smileface");
        setSize(700, 600);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(50, 100, 580, 365);

        g.setColor(Color.PINK);
        g.fillOval(260, 140, 135, 130);

        g.setColor(Color.BLACK);
        g.fillRect(300, 168, 10, 10);
        g.fillRect(350, 168, 10, 10);

        g.drawLine(328, 175, 328, 215);
        g.drawArc(295, 200, 65, 50, 180, 180);

        g.setColor(Color.RED);
        g.fillOval(590, 225, 10, 10);
    }

    public static void main(String[] args) {
        new Smileface();
    }
}