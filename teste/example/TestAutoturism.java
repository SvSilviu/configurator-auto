package example;

import Problema2.*;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestAutoturism {

    @Test
    public void test() {

        TipMotor tipMotor1 = new TipMotor(Motorizare.BENZINA, 300, 15, 350, CutieDeViteze.AUTOMATA);
        TipMotor tipMotor2 = new TipMotor(Motorizare.ELECTRIC, 250, 0, 0, CutieDeViteze.AUTOMATA);
        TipMotor tipMotor3 = new TipMotor(Motorizare.MOTORINA, 275, 10, 380, CutieDeViteze.MANUALA);
        TipMotor tipMotor4 = new TipMotor(Motorizare.HYBRID, 200, 6, 105, CutieDeViteze.AUTOMATA);

        Interior interior1 = new Interior(Tapiterie.ALCANTARA, true, false, 10);
        Interior interior2 = new Interior(Tapiterie.PIELE, false, true, 12);
        Interior interior3 = new Interior(Tapiterie.TEXTIL, true, true, 10);

        Exterior exterior1 = new Exterior(Jante.ALIAJ, "Albastru", 18, false);
        Exterior exterior2 = new Exterior(Jante.TABLA, "Alb", 15, false);
        Exterior exterior3 = new Exterior(Jante.ALIAJ, "Negru", 21, true);

        ArrayList<Optiune> optiuneList = new ArrayList<>();

        optiuneList.add(tipMotor1);
        optiuneList.add(tipMotor2);
        optiuneList.add(tipMotor3);
        optiuneList.add(tipMotor4);
        optiuneList.add(interior1);
        optiuneList.add(interior2);
        optiuneList.add(interior3);
        optiuneList.add(exterior1);
        optiuneList.add(exterior2);
        optiuneList.add(exterior3);

        Autoturism autoturism = new Autoturism("Bmw","Seria 5",2020,optiuneList);

        autoturism.descriere();

        autoturism.resetare();




    }
}
