package Model;

public class Player extends Figure {

    private boolean loaded;

    public Player( int vitality) {
        super( vitality);
        loaded=false;
    }

    @Override
    public String lose() {

        String [] lostMessage= new String[4];
        lostMessage[1]="The Monster wins!";
        lostMessage[2]="You lost";
        lostMessage[3]="You  can´t save the princess";
        lostMessage[0]="The monster killed";

        int i = (int) (Math.random() * 4);
        return lostMessage[i];
    }
    }






