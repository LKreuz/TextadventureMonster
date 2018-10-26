package View;

import Contoller.MainController;

import javax.swing.*;

public class MainView2 extends JFrame {

    private MainController mainController;
    private JPanel startPanel, gamePanel;


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

    public void play(String name){
        mainController.createFigureHandler(name);
        this.getContentPane().removeAll();
        this.getContentPane().invalidate();
        this.gamePanel = new GamePanelHandler2(name, mainController.getPlayerVitality(),mainController.getMonsterVitality(),mainController).getPanel2();
        this.getContentPane().add(gamePanel);
        this.getContentPane().revalidate();

    }
}
