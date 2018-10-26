package Model;

public class Player extends Figure {

    private String gender;
    private boolean loaded;

    public Player( int vitality, int level, String gender) {
        super( vitality, level);
        this.gender = gender;
        loaded=false;
    }





}
