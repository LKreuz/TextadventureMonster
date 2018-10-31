package Model;

public class Player extends Figure {

//Attribut
    private boolean loaded;

//Konstruktor
    public Player( int vitality) {
        super( vitality);
        loaded=false;
    }

//Polymorphie abgänderte Mthodeo aus der Oberklasse
    @Override
    public String lose() {
        return "you lost! The monster wins and keeps the princess";
    }
}





