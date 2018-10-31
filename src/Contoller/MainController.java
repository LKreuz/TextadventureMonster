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
     * Mit dieser Methode wird der Spieler erschaffen.
     * @param name - der Name des Sielers
     */

    public Player createPlayer(String name) {
        player = new Player( 2);
        return player;
    }

    /**
     * Mit dieser Methode wird der Spieler erschaffen.
     */

    public Monster createMonster() {
        monster = new Monster( 3);
        return monster;
    }

    /**
     * Mit dieser Methode wird ein Objekt der Klasse "FigureHandler" erschaffen.
     * @param playerName - Name des Spielers, wird in der Methode "create Player" benötigt.
     */

    public void createFigureHandler(String playerName){
        figureHandler= new FigureHandler(createPlayer(playerName),createMonster());
    }

    /**
     * Es folgen viele getter- und setter- Methoden.
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

    /**
     * Es wird die Methode "handleAction" des FigureHandlers aufgerufen.
     * @param playerAnswer - Übergebene Aktion des Spielers.
     */

    public void  answer(String playerAnswer){
        figureHandler.handleAction(playerAnswer);
    }

    /**
     * Diese Methode überprüft, ob man gewonnen oder verloren hat.
     */

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