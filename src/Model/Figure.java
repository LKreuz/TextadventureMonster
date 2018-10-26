package Model;

public abstract class Figure {

    protected String Name;
    protected int vitality;
    protected int fight;
    protected boolean loaded;

    public Figure( int vitality) {

        this.vitality = vitality;
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

    public abstract String lose();
}


