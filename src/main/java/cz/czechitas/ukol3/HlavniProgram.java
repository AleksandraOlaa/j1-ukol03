package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    /*
    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");
    }
     */

    public static void main(String... args) {
        Pamet myPamet = new Pamet();
        myPamet.setKapacita(14_555_000_000L);
        myPamet.setRam("pamet ram");
        System.out.println(myPamet.getPamet());

        Dysk myDysk = new Dysk();
        myDysk.setKapacitaDysku(248_567_382_105L);
        myDysk.setVyuziteMisto(184_999_452_908L);
        myDysk.setPevnyDysk("pevny dysk");
        System.out.println(myDysk.getDysk());

        Procesor myProcesor = new Procesor();
        myProcesor.setVyrobce("Intel");
        myProcesor.setRychlost(3_400_000_000_000L);
        myProcesor.setCpu("jeden procesor s jednym jadrem");
        System.out.println(myProcesor.getProcesor());

        Pocitac myPocitac;
        myPocitac = new Pocitac();
        myPocitac.isJeZapnuty();
        myPocitac.vypniSe();
        myPocitac.isJeZapnuty();
        myPocitac.zapniSe();
        myPocitac.isJeZapnuty();

       //myDysk.vymazSouboryOVelikosti(200L);
        }
    }




