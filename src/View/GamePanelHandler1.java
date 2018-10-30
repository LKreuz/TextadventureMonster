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

    /**
     * CreateButtins wird aufgerufen. MainController wird erstellt.
     * Alle Label werden befüllt.
     * @param name
     * @param strength
     * @param monsterPower
     * @param mainC
     */
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

    /**
     * Je nachdem welcher Knopf gedrückt wird, wird ein String zur Überprüfung an actionText übergeben.
     */
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

    /**
     * Die Label werden geupdated, wenn Gewonnen oder Verloren wurde werden die Knöpfe ausgeschaltet.
     */

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

    /**
     * Der Moderator bekommt den Text was der Spieler und was der Computer gemacht haben übergeben.
     */

    public void updateGame(){
        moderator.setText("You "+actionText +" and the monster "+ mainC.getMAction() );

    }

    /**
     *  Die aktion vom Spieler wird an den MainController übergeben die View wird geupdated, je nachdem wer gewonnen hat
     *  wird dem Moderator ein Endtext übergeben.
     */

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
