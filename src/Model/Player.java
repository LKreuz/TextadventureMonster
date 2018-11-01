package Model;

public class Player extends Figure {

//Attribut
    private boolean loaded;

//Konstruktor
    public Player( int vitality) {
        super( vitality);
        loaded=false;
    }

    /**Polymorphie
     * abgänderte Methode aus der Oberklasse
     * zufälliger text wird angezeift wenn der Player verloren hatt
     * @return Text wird zrückgegeben
     */
    @Override
    public String lose() {

        String [] lostMessage= new String[4];
        lostMessage[1]="The monster wins!";
        lostMessage[2]="You lost";
        lostMessage[3]="You can´t save the princess";
        lostMessage[0]="The monster killed you";

        int i = (int) (Math.random() * 4);
        return lostMessage[i];
    }
    }






