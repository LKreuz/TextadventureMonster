package Model;

public abstract class Figure {

    protected String Name;
    protected int vitality;
    protected int Level;
    protected int fight;
    protected boolean loaded;

    public Figure( int vitality, int level) {

        this.vitality = vitality;
        Level = level;
        loaded=false;
    }


    public String getName() {
        return Name;
    }
    public void setName(String n){
        Name=n;
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


