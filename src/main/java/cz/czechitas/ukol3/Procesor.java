package cz.czechitas.ukol3;

public class Procesor {

    private String vyrobce;

    private long rychlost;

    private String cpu;


    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String toString() {
            return "Procesor" + " - " +
                    "vyrobce procesoru je " + vyrobce + ", obsahuje " + cpu +
                    ", a ma rychlost " + rychlost;
        }

}
