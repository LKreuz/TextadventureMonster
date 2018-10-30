package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanelHandler1 {
    private JTextField name;
    private JButton startButton;
    private MainView1 mainView;
    private JPanel panel;

    /**
     * Es wird eine View erzeugt und die Methode crateButtons aufgerufen.
     * @param mainView
     */
    public StartPanelHandler1(MainView1 mainView) {
        createButtons();
        this.mainView = mainView;

    }

    public JPanel getPanel(){
        return panel;
    }

    /**
     * Wenn der Play Knopf gedrückt wird, wird die Methode startGameClicked ausgeführt.
     */
    private void createButtons(){
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGameClicked();
            }
        });
    }

    /**
     * Der Name wird zugewiesen und plav in der MainView wird aufgerufen.
     */
    private void startGameClicked(){
        String name = this.name.getText();
        mainView.play(name);
    }
}
