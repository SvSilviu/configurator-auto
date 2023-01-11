package Problema2;

public class TipMotor extends Optiune {

    private Motorizare motorizare = Motorizare.HYBRID;
    private int caiPutere = 230;
    private double consumMixt = 12.5;
    private int emisiiCo2 = 300;
    private CutieDeViteze cutieDeViteze = CutieDeViteze.AUTOMATA;

    public TipMotor(Motorizare motorizare, int caiPutere, double consumMixt, int emisiiCo2, CutieDeViteze cutieDeViteze) {
        if (motorizare.equals("Benzina")) {
            this.motorizare = Motorizare.BENZINA;
        } else if (motorizare.equals("Motorina")) {
            this.motorizare = Motorizare.MOTORINA;
        } else if (motorizare.equals("Hybrid")) {
            this.motorizare = Motorizare.HYBRID;
        } else if (motorizare.equals("Electric")) {
            this.motorizare = Motorizare.ELECTRIC;
        } else this.motorizare = motorizare;
        this.caiPutere = caiPutere;
        this.consumMixt = consumMixt;
        this.emisiiCo2 = emisiiCo2;
        this.cutieDeViteze = cutieDeViteze;
    }

    public CutieDeViteze getCutieDeViteze() {
        return cutieDeViteze;
    }

    public void setCutieDeViteze(CutieDeViteze cutieDeViteze) {
        this.cutieDeViteze = cutieDeViteze;
    }

    public Motorizare getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(Motorizare motorizare) {
        this.motorizare = motorizare;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    public double getConsumMixt() {
        return consumMixt;
    }

    public void setConsumMixt(double consumMixt) {
        this.consumMixt = consumMixt;
    }

    public int getEmisiiCo2() {
        return emisiiCo2;
    }

    public void setEmisiiCo2(int emisiiCo2) {
        this.emisiiCo2 = emisiiCo2;
    }

    @Override
    public String toString() {
        return "Motorizare - " + motorizare + "\n" + "Cai Putere - " + caiPutere + "\n" + "Consum Mixt - "
                + consumMixt + "\n" + "Emisii Co2 - " + emisiiCo2 + "\n" + "Cutie De Viteze - " + cutieDeViteze + "\n";
    }

    @Override
    public boolean equals(Object object) {
        TipMotor t = (TipMotor) object;
        return true;
    }

    @Override
    public void descriere() {
        System.out.println(this);
    }

    @Override
    public void resetare() {

        this.motorizare = Motorizare.HYBRID;
        this.cutieDeViteze = CutieDeViteze.AUTOMATA;
        this.caiPutere = 250;
        this.consumMixt = 12.5;
        this.emisiiCo2 = 300;


    }
}
