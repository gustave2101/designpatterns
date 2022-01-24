package auto;

public class Personenauto extends Auto {

    protected int aantal_deuren = 4;

    Personenauto(String merknaam){

        super(merknaam);
    }

    public void setAantal_deuren(int d){

        this.aantal_deuren = d;
    }

    public void printPersonenAuto(){

        System.out.print("aantal deuren " + this.aantal_deuren);
    }
    

}
