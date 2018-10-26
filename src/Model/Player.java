package Model;

public class Player extends Figure {

    private String gender;
    private boolean loaded;

    public Player(String name, int vitality, int level, String gender) {
        super(name, vitality, level);
        this.gender = gender;
        loaded=false;
    }





}
