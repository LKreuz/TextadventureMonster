package Model;

public class Player extends Figure {

    private String gender;
    private boolean loaded;

    public Player( int vitality) {
        super( vitality);
        this.gender = gender;
        loaded=false;
    }

    @Override
    public String lose() {
        return "you lost! The monster wins and keeps the princess";
    }
}





