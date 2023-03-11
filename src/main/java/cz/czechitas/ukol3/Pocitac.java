package cz.czechitas.ukol3;

public class Pocitac {

    public boolean jeZapnuty;

    public Pocitac() {
        jeZapnuty = true;
    }

    public void isJeZapnuty() {
        if (jeZapnuty = true) {
            System.out.println("Pocitac je zapnuty");
        } else {
            System.err.println("Pocitac je vypnuty");
        }
    }

    public void zapniSe() {
        if (this.jeZapnuty = false) ;
        {
            this.jeZapnuty = true;
            return;
        }
    }

    public void vypniSe() {
        if (this.jeZapnuty = true) ;
        {
            this.jeZapnuty = false;
            return;
        }
    }

}


