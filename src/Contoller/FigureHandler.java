package Contoller;

import Model.Monster;
import Model.Player;

public class FigureHandler {

    private Player player;
    private Monster monster;
    private String mAction;

    public FigureHandler(Player player, Monster monster){
        this.player = player;
        this.monster = monster;
        mAction = "";
    }

    /**
     * Hier werden die Aktionen von Spieler und Monster gehandhabt.
     * @param playerAction - Aktion des Spielers
     */

    public void handleAction(String playerAction){
        String MonsterA = monster.randomAction();
        if(playerAction.equals("shoot")&& player.getLoaded() && !MonsterA.equals("hide")){
            monster.setVitality(monster.getVitality()-1);
            player.setLoaded(false);

        }
        if(MonsterA.equals("shoot") && !playerAction.equals("hide")){
            player.setVitality(player.getVitality()-1);
            monster.setLoaded(false);
        }
        if(playerAction.equals("shoot")&& player.getLoaded()){
            player.setLoaded(false);
        }
         if (playerAction.equals("reload") && !player.getLoaded()){
            player.setLoaded(true);
        }
        System.out.println(MonsterA);
        setMonsterAction(MonsterA);
    }

    /**
     * setter-Methode
     */

    public void setMonsterAction(String a){
         mAction = a;
    }

    /**
     * getter-Methode
     */

    public String getmAction(){
        return mAction;
    }
}
