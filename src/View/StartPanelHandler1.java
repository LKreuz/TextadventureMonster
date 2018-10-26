package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanelHandler1 {
    private JTextField textField1;
    private JButton startButton;
    private JButton button1;
    private JButton button2;
    private JSplitPane choosePlayer;
    private MainView1 mainView;
    private JPanel panel;


    public StartPanelHandler1(MainView1 mainView) {
        createButtons();
        this.mainView = mainView;

    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    private void startGameClicked(){
        String name = textField1.getText();
        mainView.play(name);
    }
}
