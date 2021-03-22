package brickBraker;

import javax.swing.JFrame;


// Diese Klasse beinhaltet das Spiel. Die Methode makeGame() wird aus Main aufgerufen und startet das Spiel 
public class Game {

public void makeGame() {
    
    // Ein Spielfensterobjekt erzeugen und der Referenzvariable "game" zuweisen
    JFrame game = new JFrame();

    // Ein Objekt der Klasse Gameplay erzeugen
    Gameplay gamePlay = new Gameplay(); 

    // Die Standardgrößen für das Spielfenster festlegen - erster Wert kommt auf 700 (800 ist ein Test für GitHub)
    game.setBounds(10, 10, 801, 600);
    game.setTitle("Breakout Ball"); 
    game.setResizable(false); 
    game.setVisible(true);
    game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    game.add(gamePlay); 
    
}
    
     



}
