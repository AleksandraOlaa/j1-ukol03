package cz.czechitas.ukol3;

import java.lang.constant.Constable;

public class Dysk {
    private long kapacitaDysku;

    private long vyuziteMisto;

    private  String pevnyDysk;

    public long velikost;

    public void setKapacitaDysku (long kapacitaDysku){
        this.kapacitaDysku = kapacitaDysku;
    }

    public void setVyuziteMisto (long vyuziteMisto){
        this.vyuziteMisto = vyuziteMisto;
    }

    public void setPevnyDysk (String pevnyDysk){
        this.pevnyDysk = pevnyDysk;
    }

    public String getDysk() {toString();
        return "Dysk " + "je " + pevnyDysk +
                ", ktery ma kapacitu " + kapacitaDysku +
                ", z toho vyuzite misto je" + " " + vyuziteMisto;
    }

    public void setVelikost(long velikost) {
        this.velikost = velikost;
    }

    /*
    public void vytvorSouborOVelikosti(long velikost) {
        long noveVyuziteMisto = velikost + vyuziteMisto;
        return noveVyuziteMisto;
    }
     */

    // public void vymazSouboryOVelikosti(long velikost);

}
