//opdracht 8.1
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TekstReset extends Applet {
    TextField tekstvak;
    Label label;
    Button button;
    Button button2;


    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("Typ iets in het tekstvakje");
        button = new Button("Ok");
        button.addActionListener( new Buttonlistener() );
        button2 = new Button("Reset");
        button2.addActionListener( new Buttonlistener2() );
        add(label);
        add(tekstvak);
        add(button);
        add(button2);
    }

    public void paint(Graphics g) {

        g.drawString(tekstvak.getText(), 60, 50 );
    }

    class Buttonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
    class Buttonlistener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}