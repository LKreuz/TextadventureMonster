package View;

import Contoller.MainController;

import javax.swing.*;

public class MainView2 extends JFrame {

    private MainController mainController;
    private JPanel startPanel, gamePanel;

    /**
     *  Es wird ein StartPanel ezeugt.
     *  Die MainView2 lernt den MainController kennen
     *  Das Start Panel wir aufgerufen mit einer größe von 1000x750
     *  Beim klick auf das X wird das Fenster geschlossen die Sichtbarkeit wird auf true gesetz
     * @param mainController referenz zum MainController:kennt jetzt den MainController
     */
    public MainView2(MainController mainController) {

        this.mainController = mainController;
        this.startPanel = new StartPanelHandler2(this).getPanel();

        this.getContentPane().add(startPanel);

        this.setLocation(50, 50);
        this.setSize(1000, 750);
        this.setResizable(false);
        this.setTitle("Adventure");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Methode, die das eigentliche Spiel startet
     * Spieler Monster und FigureHandler werden erstellt
     * Das aktuelle Panel wird entfernt
     * ein neues Panel für das richtige Spiel wird erzeugt und als aktuelles Panel eingesetzt
     * @param name: Name des Spielers der übergeben wird
     */
    public void play(String name){
        mainController.createFigureHandler(name);
        this.getContentPane().removeAll();
        this.getContentPane().invalidate();
        this.gamePanel = new GamePanelHandler2(name, mainController.getPlayerVitality(),mainController.getMonsterVitality(),mainController).getPanel2();
        this.getContentPane().add(gamePanel);
        this.getContentPane().revalidate();

    }
}
