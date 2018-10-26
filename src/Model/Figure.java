package Model;

public abstract class Figure {

    private String Name;
    private int vitality;
    private int Level;
    private int fight;
    protected boolean loaded;

    public Figure(String name, int vitality, int level) {
        Name = name;
        this.vitality = vitality;
        Level = level;
        loaded=false;
    }


    public String getName() {
        return Name;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getFight() {
        return fight;
    }

    public void setFight(int fight) {
        this.fight = fight;
    }

    public void setLoaded(boolean i){
        loaded=i;
    }

    public boolean getLoaded(){
        return loaded;

    }

    public abstract void lose();
}


