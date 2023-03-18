package cz.czechitas.ukol3;

public class Dysk {
    private long kapacitaDysku;

    private long vyuziteMisto;

    private String pevnyDysk;

    public long velikost;

    public void setKapacitaDysku(long kapacitaDysku) {
        this.kapacitaDysku = kapacitaDysku;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    public void getVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    public void getKapacitaDysku(long kapacitaDysku) {
        this.kapacitaDysku = kapacitaDysku;
    }

    public void setPevnyDysk(String pevnyDysk) {
        this.pevnyDysk = pevnyDysk;
    }

    public String toString() {
        return "Dysk " + "je " + pevnyDysk +
                ", ktery ma kapacitu " + kapacitaDysku +
                ", z toho vyuzite misto je" + " " + vyuziteMisto;
    }

    public void setVelikost(long velikost) {
        this.velikost = velikost;
    }


    public long vytvorSouborOVelikosti(long velikost) {
        if ((vyuziteMisto + velikost) < kapacitaDysku) {
            setVyuziteMisto(velikost + vyuziteMisto);
            System.out.println("Nove vyuzite misto je: " + vyuziteMisto);
        } else {
            System.err.println("Na soubor neni misto.");
        }
        return vyuziteMisto;
    }

    public long vymazSouboryOVelikosti(long velikost) {
        if ((vyuziteMisto - velikost) >= 0) {
            setVyuziteMisto(vyuziteMisto - velikost);
            System.out.println("Nove vyuzite misto je:" + vyuziteMisto);
        } else {
            System.err.println("Soubory jsou prilis velke.");
        }
        return vyuziteMisto;
    }



}

