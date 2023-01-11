package Problema2;

import java.util.ArrayList;

public class Autoturism {

    private ArrayList<Optiune> optionsList;

    private String marca;
    private String model;
    private int anFabricatie;

    public Autoturism(String marca ,String model,int anFabricatie , ArrayList<Optiune> optiuneList) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.optionsList = optiuneList;
    }

    public Autoturism() {

    }

    public Autoturism(ArrayList<Optiune> listaOptiuni) {
    }

    public void setOptionsList(ArrayList<Optiune> optionsList) {
        this.optionsList = optionsList;
    }

    public String getOptionList(){
        String list ="";
        for(Optiune optiune : optionsList){
            list+=optiune.toString();
        }
        return list;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }


    public void descriere() {
        for (Optiune optiune : optionsList) {
            optiune.descriere();
        }
    }
    public void resetare(){

        for(Optiune optiune : optionsList){
            optiune.resetare();
        }

    }

    public Interior getInterior() {
        return new Interior();
    }

    public Exterior getExterior() {
        return new Exterior();
    }
}





