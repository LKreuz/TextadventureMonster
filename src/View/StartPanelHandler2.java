package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartPanelHandler2 {
    private JTextField name;
    private JTextField choosePlayer;
    private JLabel Name;
    private JButton startButton2;
    private MainView2 mainView2;
    private JPanel panel;
    private JLabel choose;
    private JLabel start;

    /**
     * Konstruktor dieer Klasse
     * interne Methode createButtons wird auf gerufen
     * lernt MainView2 kennen
     * @param mainView2 Referenz zur MainView
     */
    public StartPanelHandler2(MainView2 mainView2) {
        createButtons();
        this.mainView2 = mainView2;

    }

    /**
     * Aktuelles panel wird zurückgegeben
     * @return panel
     */
    public JPanel getPanel(){
        return panel;
    }

    /**
     * ActionListener wird für den Startbutton erstellt
     * wenn dieser gedrückt wird dann wird startButton2pressed aufgerufen
     */
    private void createButtons(){
        startButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  startButton2pressed();

            }
        });
    }


    /**
     * wird von createButtons aufgerufen
     * und die Mainview wird aufgerufen damit das Spiel startet
     */
    private void startButton2pressed(){
        String name2 = name.getText();
        mainView2.play(name2);
    }
}


