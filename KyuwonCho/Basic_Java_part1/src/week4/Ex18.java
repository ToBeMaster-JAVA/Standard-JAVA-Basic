package week4;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!");
    }
}

public class Ex18 {
    public static void main() {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}
