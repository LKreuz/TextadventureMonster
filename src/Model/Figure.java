package Model;

public abstract class Figure {

//Attribute
    protected String Name;
    protected int vitality;
    protected boolean loaded;

//Konstuktor
    public Figure( int vitality) {

        this.vitality = vitality;
        loaded=false;
    }

//Getter und Setter Methoden
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


    /**Methode zum nachladen vor dem Schiesen
     *
     * @param i parameter wird entweder mit true oder false übergeben
     *          Attribut loaded wird zum übergebenen Wahrheitswert
     */
    public void setLoaded(boolean i){
        loaded=i;
    }

    public boolean getLoaded(){
        return loaded;

    }

/**Polymorphie
 Methode zum Anzeigen eines Textes jenachdem wer verliert
 */
    public abstract String lose();
}


