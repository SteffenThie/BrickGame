package brickBraker;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Um den Objekten Form und Farbe zu geben
import java.awt.Color;
import java.awt.Graphics;


public class Gameplay extends JPanel implements KeyListener, ActionListener {

    private boolean play = false; 
    private int score = 0; 

    private int totalBricks = 21; 

    private Timer timer; 
    private int delay = 8; 

    private int playerX = 310; 

    private int ballposX = 120; 
    private int ballposY = 350; 
    private int ballXdir = -1;
    private int ballYdir = -2;

    public Gameplay() {

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();


    }
     

    // Diese Methode ist dazu da, die Elemente wie Ball oder den "Reflektor" zu erstellen
    public void paint (Graphics g) {
        // Definiert den Hintergrund 
        g.setColor(Color.black); 
        g.fillRect(1, 1, 692, 592); 

        // borders

        //Weiter bei 14:38min 

    } 

    
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void actionPerformed(ActionEvent e) {

    }



}
