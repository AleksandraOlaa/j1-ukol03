package cz.czechitas.ukol3;

public class Pamet {

    private long kapacita;

    private String ram;

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }


    public String toString() {
        return "Pamet " +
                "ma kapacitu " + kapacita + " a je to: " + ram;
    }

}

