package week4;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class Ex19 {
    public static void main() {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!");
            }
        });
    }
}
