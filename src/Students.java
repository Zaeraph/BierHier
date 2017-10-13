//opdracht 8.2
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Students extends Applet {
    int TallyMan;       //Tally is aantal in het Engels.
    int TallyWomen;
    int PotentialMan;
    int PotentialWoman;
    Button ButtonTM;
    Button ButtonTW;
    Button ButtonPM;
    Button ButtonPW;

    public void init() {

        TallyMan = 0;
        TallyWomen = 0;
        PotentialMan = 0;
        PotentialWoman = 0;

        ButtonTM = new Button("Man");
        ButtonTM.addActionListener( new ButtonListenerTM() );
        ButtonTW = new Button("Vrouw");
        ButtonTW.addActionListener( new ButtonListenerTW() );
        ButtonPM = new Button("Potentiële vrouw");
        ButtonPM.addActionListener( new ButtonListenerPM() );
        ButtonPW = new Button("Potentiële man");
        ButtonPW.addActionListener( new ButtonListenerPW() );

        add(ButtonTM);
        add(ButtonTW);
        add(ButtonPM);
        add(ButtonPW);

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen: " + TallyMan, 20, 60 );
        g.drawString("Aantal vrouwen: " + TallyWomen, 20, 80 );
        g.drawString("Potentiële mannen: " + PotentialMan, 20, 100 );
        g.drawString("Potentiële vrouwen: " + PotentialWoman, 20, 120 );
    }

    class ButtonListenerTM implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TallyMan++;
            repaint();
        }
    }

    class ButtonListenerTW implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TallyWomen++;
            repaint();
        }
    }
    class ButtonListenerPM implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotentialMan++;
            repaint();
        }
    }

    class ButtonListenerPW implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotentialWoman++;
            repaint();
        }
    }
}