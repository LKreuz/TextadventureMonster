package View;

import Contoller.MainController;

import javax.swing.*;

public class MainView1 extends JFrame {

    private MainController mainController;
    private JPanel startPanel, gamePanel;

    /**
     *  Es werden ein MainController und ein StartPanel ezeugt.
     *  Das Start Panel wir aufgerufen mit einer größe von 1000x750
     *  Man Kann die Fenstergröße nicht verändern. Der Titel lautet Adventureeeee.
     *  Beim klick auf das X wird das Fenster geschlossen die Sichtbarkeit wird auf true gesetzt.
     * @param mainController
     */

    public MainView1(MainController mainController) {

        this.mainController = mainController;
        this.startPanel = new StartPanelHandler1(this).getPanel();

        this.getContentPane().add(startPanel);

        this.setLocation(50, 50);
        this.setSize(1000, 750);
        this.setResizable(false);
        this.setTitle("Adventureeeee");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     *  Diese Methode wird nach dem drücken des Knopfes Play auf dem StartPanel ausgeführt.
     *  Es wird eine neue Figur erstellt und das GamePanel wird aufgerufen.
     * @param name
     */

    public void play(String name){
        mainController.createFigureHandler(name);
        this.getContentPane().removeAll();
        this.getContentPane().invalidate();
        this.gamePanel = new GamePanelHandler1(name, mainController.getPlayerVitality(),mainController.getMonsterVitality(),mainController).getPanel2();
        this.getContentPane().add(gamePanel);
        this.getContentPane().revalidate();

    }
}
