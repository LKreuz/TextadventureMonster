package Contoller;

import Model.Monster;
import Model.Player;

public class MainController {
    private FigureHandler figureHandler;
    private Player player;
    private Monster monster;

    public MainController(){

    }

    public Player createPlayer(String name) {
        player = new Player( 2, 1, "");
        player.setName(name);
        return player;

    }

    public Monster createMonster(String name) {
        monster = new Monster(2, 1);
        return monster;
    }
    public void createFigureHandler(String playerName){

        figureHandler= new FigureHandler(createPlayer(playerName),createMonster("ulf"));
    }

    public String getPlayerName() {
        return player.getName() ;
    }

    public int getPlayerVitality() {
        return player.getVitality();
    }

    public int getPlayerLevel() {
        return player.getLevel();
    }

    public String getMonsterName() {
        return monster.getName() ;
    }

    public int getMonsterVitality() {
        return monster.getVitality();
    }

    public int getMonsterLevel() {
        return monster.getLevel();
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
            return false;
        }
        return true;
    }
}