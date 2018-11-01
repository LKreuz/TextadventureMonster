package Model;

public class Monster extends Figure {

//Attribut
    private boolean loaded;

//Konstruktor
    public Monster(int Strength) {
        super(Strength);
        loaded = false;
        Name=setMonstername();

    }

    /**Array
     * abwechslungsreiche Monsternamemn
     * @returnausgewählter Monstername
     */
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

    /**
     * Methode
     * es wird eine zufällige Nummer  für die Action des  Monster ausgewählt
     * @return
     */
    public int getRandomNumber(){
        int randomAction = (int) (Math.random() * 2);
        return randomAction;
    }

    /**
     * eine Zufällige Action wird für das Monster ausgewählt mit dem vorher zufällig bestimmten Wert
     * @return String der Action des Monsters
     */
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

    /** Polymorphie abgänderte Mthodeo aus der Oberklasse
     *  Zufällige Message beim verlieren des Monsters wird ermittelt aus 4 verschiedenen
     * @return ausgewählte Message
     */
    public String lose(){

            String [] lostMessage= new String[4];
            lostMessage[1]="The monster lost!";
            lostMessage[2]="You win";
            lostMessage[3]="You save the princess";
            lostMessage[0]="You killed the monster";

            int i = (int) (Math.random() * 4);
            return lostMessage[i];
        }
    }





