package Problema2;

public class Interior extends Optiune {

    private Tapiterie tapiterie = Tapiterie.ALCANTARA;
    private boolean navigatie = true;
    private boolean scauneElectrice = false;
    private int airbaguri = 10;


    public Interior(){

    }


    public Tapiterie getTapiterie() {
        return tapiterie;
    }

    public void setTapiterie(Tapiterie tapiterie) {
        this.tapiterie = tapiterie;
    }

    public boolean isNavigatie() {
        return navigatie;
    }

    public void setNavigatie(boolean navigatie) {
        this.navigatie = navigatie;
    }

    public boolean isScauneElectrice() {
        return scauneElectrice;
    }

    public void setScauneElectrice(boolean scauneElectrice) {
        this.scauneElectrice = scauneElectrice;
    }

    public int getAirbaguri() {
        return airbaguri;
    }

    public void setAirbaguri(int airbaguri) {
        this.airbaguri = airbaguri;
    }

    @Override
    public String toString() {
        return "Tapiterie - " + tapiterie + "\n" + "Navigatie - " + navigatie + "\n" +
                "Scaune Electrice - " + scauneElectrice + "\n" + "Airbaguri - " + airbaguri + "\n";
    }

    @Override
    public boolean equals(Object o) {

        Interior interior = (Interior) o;
        return true;
    }

    @Override
    public void descriere() {
        System.out.println(this);
    }

    @Override
    public void resetare() {

        this.tapiterie = Tapiterie.ALCANTARA;
        this.airbaguri = 10;
        this.navigatie = true;
        this.scauneElectrice = false;
    }

}
