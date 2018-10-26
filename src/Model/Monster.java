package Model;

public class Monster extends Figure {
    private boolean loaded;

    public Monster(int Strength, int Level) {
        super(Strength, Level);
        loaded = false;
        Name=setMonstername();

    }

    public String setMonstername() {
        String[] MN = new String[10];
        MN[0] = "Poisongolem";
        MN[1] = "Dead Dweller";
        MN[2] = "Abyssbody";
        MN[3] = "Greedy Howler";
        MN[4] = "Thornwings";
        MN[5] = "Moldling";
        MN[6] = "Smogscream";
        MN[7] = "White-Eyed Gollum";
        MN[8] = "Shadow Thing";
        MN[9] = "Ripper";

        int index = (int) (Math.random() * 9);
        return MN[index];
    }

    public int getRandomNumber(){
        int randomAction = (int) (Math.random() * 2);
        return randomAction;
    }
    public String randomAction() {
       int i= getRandomNumber();

        System.out.println(""+i);
        if (getLoaded() == false) {
            if (i == 1) {
                setLoaded(true);
                return new String("reload");

            }
            if (i == 0) {
                return new String("hide");

            }
        } else {
            if (i == 1) {
                return new String("hide");
            }
            if (i == 0) {
                setLoaded(false);
                return new String("shoot");


            }


        }
        return new String ("action fehlgeschlagen");
    }


}

