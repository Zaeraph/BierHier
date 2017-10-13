//Opdracht 8.3
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class VAT extends Applet {
    double Amount1;
    double Amount2;
    TextField Text;
    Label label;
    Button button;

    public void init() {
        this.setSize(new Dimension(400,200));
        Text = new TextField("",20);
        label = new Label("Bedrag exc. BTW:");
        button = new Button("Ok");
        button.addActionListener( new ButtonListener());
        add(label);
        add(Text);
        add(button);
    }

    public void paint(Graphics g) {
        if (Amount2 > 0) {
            g.drawString("Bedrag inc. BTW:" + (Amount2), 50, 60);
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Amount1 = Integer.parseInt(Text.getText());
            Amount2 = Amount1 * 1.21;
            repaint();
        }
    }
}