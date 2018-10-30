package Model;

public class Player extends Figure {

    private boolean loaded;

    public Player( int vitality) {
        super( vitality);
        loaded=false;
    }

    @Override
    public String lose() {
        return "you lost! The monster wins and keeps the princess";
    }
}





