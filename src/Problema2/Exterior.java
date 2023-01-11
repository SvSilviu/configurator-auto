package Problema2;

public class Exterior extends Optiune {

    private Jante jante= Jante.ALIAJ;
    private String culoare = "Alb";
    private int dimensiuneJantaInch = 19;


    public Exterior() {

    }

    public Jante getJante() {
        return jante;
    }

    public void setJante(Jante jante) {
        this.jante = jante;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getDimensiuneJantaInch() {
        return dimensiuneJantaInch;
    }

    public void setDimensiuneJantaInch(int dimensiuneJantaInch) {
        this.dimensiuneJantaInch = dimensiuneJantaInch;
    }



    @Override
    public String toString() {
        return "Jante - " + jante + "\n" + "Culoare - " + culoare + "\n" +
                "Dimensiune Janta Inchi - " + dimensiuneJantaInch + "\n" + "Soft Close usi - " +"\n";
    }

    @Override
    public boolean equals(Object obj) {
        Exterior e = (Exterior) obj;
        return true;
    }

    @Override
    public void descriere() {
        System.out.println(this);
    }

    @Override
    public void resetare() {

        this.jante = Jante.ALIAJ;
        this.culoare = "Alb";
        this.dimensiuneJantaInch = 19;


    }

}
