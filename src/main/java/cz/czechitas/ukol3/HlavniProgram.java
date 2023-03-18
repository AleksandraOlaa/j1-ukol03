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
        System.out.println(myPamet);

        Dysk myDysk = new Dysk();
        myDysk.setKapacitaDysku(248_567_382_105L);
        myDysk.setVyuziteMisto(184_999_452_908L);
        myDysk.setPevnyDysk("pevny dysk");
        System.out.println(myDysk);

        Procesor myProcesor = new Procesor();
        myProcesor.setVyrobce("Intel");
        myProcesor.setRychlost(3_400_000_000_000L);
        myProcesor.setCpu("jeden procesor s jednym jadrem");
        System.out.println(myProcesor);

        Pocitac myPocitac;
        myPocitac = new Pocitac();
        myPocitac.jeZapnuty();
        myPocitac.vypniSe();
        myPocitac.jeZapnuty();
        myPocitac.zapniSe();
        myPocitac.jeZapnuty();

       myDysk.vytvorSouborOVelikosti(44_302_501_282L);
       System.out.println(myDysk);
        myDysk.vytvorSouborOVelikosti(340_608_704_336L);
       myDysk.vymazSouboryOVelikosti(30_102_893_512L);
       System.out.println(myDysk);
       myDysk.vymazSouboryOVelikosti(200_498_532_111L);
        }

    }




