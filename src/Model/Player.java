package Model;

public class Player extends Figure {


    private boolean loaded;

    public Player(String name, int vitality, int level) {
        super(name,vitality,level);

        loaded=false;
    }


    @Override
    public void lose() {
        System.out.println("you lost");
    }
}
