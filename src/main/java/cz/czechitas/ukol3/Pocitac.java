package cz.czechitas.ukol3;

import static java.lang.System.out;

public class Pocitac {
    public boolean jeZapnuty;

    private String ram;

    private String cpu;

    private String pevnyDysk;

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setPevnyDysk(String pevnyDysk) {
        this.pevnyDysk = pevnyDysk;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void vypniSe() {
        if (this.ram == null || this.cpu == null || this.pevnyDysk == null) {
            out.println("Pocitac neni zapnuty.");
        } else {
            if (jeZapnuty) {
                System.err.println("Poictac je zapnuty. Muzes vypnout pocitac.");
            }
        }
    }

    public void zapniSe() {
        if (jeZapnuty) {
            out.println("Pocitac je zapnuty.");
        } else {
            if (this.ram == null || this.cpu == null || this.pevnyDysk == null) {
                System.err.println("Pocitac je vypnuty.");
            }
        }
    }
}





