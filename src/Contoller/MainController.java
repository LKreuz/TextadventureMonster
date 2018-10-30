package Contoller;

import Model.Monster;
import Model.Player;

public class MainController {
    private FigureHandler figureHandler;
    private Player player;
    private Monster monster;

    public MainController(){

    }

    /**
     *
     * @param name
     * @return
     */

    public Player createPlayer(String name) {
        player = new Player( 2);
        return player;
    }

    /**
     *
     * @return
     */

    public Monster createMonster() {
        monster = new Monster( 2);
        return monster;
    }

    /**
     *
     * @param playerName
     */

    public void createFigureHandler(String playerName){

        figureHandler= new FigureHandler(createPlayer(playerName),createMonster());
    }

    /**
     *
     * @return
     */

    public String getPlayerName() {
        return player.getName() ;
    }

    public int getPlayerVitality() {
        return player.getVitality();
    }


    public String getMonsterName() {
        return monster.getName() ;
    }


    public int getMonsterVitality() {
        return monster.getVitality();
    }


    public String getMonsterLost(){
       return  monster.lose();
    }


    public String getPlayerLost(){
        return  player.lose();
    }


    public boolean getPlayerLoaded(){return player.getLoaded();}


    public boolean getMonsterLoaded(){return monster.getLoaded();}


    public String getMAction(){return figureHandler.getmAction();}


    public void  answer(String playerAnswer){
        figureHandler.handleAction(playerAnswer);

    }

    public boolean win(){
        if (getMonsterVitality()==0) {
            return false;
        }
        if (getPlayerVitality()==0){
            player.lose();
            return false;
        }
        return true;
    }
}