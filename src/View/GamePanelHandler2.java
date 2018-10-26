package View;
import Contoller.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanelHandler2 {
    private JPanel panel2;
    private JLabel name;
    private JLabel playerName;
    private JLabel power;
    private JLabel playerPower;
    private JTextField actionText;
    private JLabel action;
    private JLabel MonsterPower;
    private JLabel getloaded;
    private JTextField writeWeitherYouWantTextField;
    private JLabel Level;
    private JLabel getMonsterPower;
    private JLabel mLoaded;
    private JLabel monsterName;
    private JButton actionButton;
    private JTextField gameUpdate;

    private MainController mainC;


    public GamePanelHandler2(String name, int strength, int level, int monsterPower, MainController mainC){
        createButtons();
        this.mainC= mainC;
        playerName.setText(name);
        playerPower.setText(String.valueOf(strength));
        getloaded.setText(String.valueOf(mainC.getPlayerLoaded()));
        monsterName.setText(mainC.getMonsterName());
        getMonsterPower.setText(String.valueOf(monsterPower));
        mLoaded.setText(String.valueOf(mainC.getMonsterLoaded()));
        updatePower();



    }
    private void createButtons(){
        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAction();
            }
        });

    }

    public JPanel getPanel2(){
        return panel2;
    }



    public void updatePower(){
        if(mainC.win()) {
            playerPower.setText(String.valueOf(mainC.getPlayerVitality()));
            getloaded.setText(String.valueOf(mainC.getPlayerLoaded()));
            mLoaded.setText(String.valueOf(mainC.getMonsterLoaded()));
            getMonsterPower.setText(String.valueOf(mainC.getMonsterVitality()));
        }else{
            actionButton.setEnabled(false);

        }
    }
    public void updateGame(){
        gameUpdate.setText("you "+actionText.getText() +" and the monster "+ mainC.getMAction() );

    }

    public void handleAction(){
        String answer= actionText.getText();
        mainC.answer(answer);
        updatePower();
        updateGame();
        if(mainC.win()==false){
            if (mainC.getPlayerVitality()==0) {
                gameUpdate.setText(" Game is over you cannot save the princess! The monster wins!");
            }
            if (mainC.getMonsterVitality()==0) {
                gameUpdate.setText(" Game is over! You save the princess and win!");
            }
        }

    }


}





