package fabriek;
import auto.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Verkoper {
    private List<Auto> autoList = new LinkedList<Auto>();
    private String naam = "";

    public Verkoper(String naam){
        this.naam = naam;
    }

    public void print(){
        System.out.println("Naam: " + naam);
        System.out.println("Alle auto's in bezit: ");
        Iterator<Auto> it = autoList.iterator();
        while(it.hasNext()){
            it.next().print();
        }
    }

    public void addAuto(Auto auto){
        autoList.add(auto);
    }
}
