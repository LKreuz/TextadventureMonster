package View;

import Contoller.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanelHandler1 {

    private JPanel panel2;
    private JButton reloadButton;
    private JButton shootButton;
    private JButton hideButton;
    private JTextField moderator;
    private JLabel monsterName;
    private JLabel getMonsterPower;
    private JLabel PlayerName;
    private JLabel playerPower;
    private JLabel getLoaded;
    private JLabel mLoaded;
    private String actionText;

    private MainController mainC;


    public GamePanelHandler1(String name, int strength,int monsterPower, MainController mainC) {
        createButtons();
        this.mainC= mainC;
        PlayerName.setText(name);
        playerPower.setText(String.valueOf(strength));
        getLoaded.setText(String.valueOf(mainC.getPlayerLoaded()));
        monsterName.setText(mainC.getMonsterName());
        getMonsterPower.setText(String.valueOf(monsterPower));
        mLoaded.setText(String.valueOf(mainC.getMonsterLoaded()));
        updatePower();

    }

    public void createButtons(){
        reloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionText = "reload" ;
                handleAction();
            }
        });

        shootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionText = "shoot" ;
                handleAction();
            }
        });

        hideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionText = "hide" ;
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
            getLoaded.setText(String.valueOf(mainC.getPlayerLoaded()));
            mLoaded.setText(String.valueOf(mainC.getMonsterLoaded()));
            getMonsterPower.setText(String.valueOf(mainC.getMonsterVitality()));
        }else{
            reloadButton.setEnabled(false);
            shootButton.setEnabled(false);
            hideButton.setEnabled(false);
            playerPower.setText(String.valueOf(mainC.getPlayerVitality()));
            getLoaded.setText(String.valueOf(mainC.getPlayerLoaded()));
            mLoaded.setText(String.valueOf(mainC.getMonsterLoaded()));
            getMonsterPower.setText(String.valueOf(mainC.getMonsterVitality()));

        }
    }

    public void updateGame(){
        moderator.setText("You "+actionText +" and the monster "+ mainC.getMAction() );

    }

    public void handleAction(){
        String answer= actionText;
        mainC.answer(answer);
        updatePower();
        updateGame();
        if(mainC.win()==false){
            if (mainC.getPlayerVitality()==0) {
                updatePower();
                moderator.setText(mainC.getPlayerLost());
            }
            if (mainC.getMonsterVitality()==0) {
                updatePower();
                moderator.setText(mainC.getMonsterLost());
            }
        }

    }

}
