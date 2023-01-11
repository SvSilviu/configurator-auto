package Problema2;

import java.util.ArrayList;
import java.util.Scanner;

public class Configurare {


    private Autoturism autoturism;
    private boolean config = true;
    private final Scanner scanner = new Scanner(System.in);
    ArrayList<Optiune> listaOptiuni;

    public Configurare() {

        listaOptiuni = new ArrayList<>();
    }

    public void meniu() {
        System.out.println("Apasati tasta 1 pentru a configura o masina");
        System.out.println("Apasati tasta 2 pentru a descrie masina creeata");
        System.out.println("Apasati tasta 3 pentru a iesi din aplicatie");
    }

    public void play() {

        boolean run = true;


        while (run) {

            meniu();
            int alegere = scanner.nextInt();
            scanner.nextLine();

            switch (alegere) {
                case 1:
                    configurare();
                    configurareMasina();
                    break;
                case 2:
                    descriere();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Ati introdus un numar incorect. Incercati din nou.");
                    break;
            }
        }
    }

    public void configurare() {

        autoturism = new Autoturism();

        System.out.println("Introduceti marca");
        autoturism.setMarca(scanner.nextLine());
        System.out.println("Ati introdus " + autoturism.getMarca() + "\n");
        System.out.println("Introduceti modelul");
        autoturism.setModel(scanner.nextLine());
        System.out.println("Ati introdus " + autoturism.getModel() + "\n");
        System.out.println("Selectati anul de fabricatie ");
        autoturism.setAnFabricatie(scanner.nextInt());
        System.out.println("Ati introdus " + autoturism.getAnFabricatie() + "\n");
    }
    public void configurareMasina() {

        System.out.println("Apasati tasta 1 pentru a adauga optiuni la Interior");
        System.out.println("Apasati tasta 2 pentru a adauga optiuni la Exterior");
        System.out.println("Apasati tasta 3 pentru a reseta toate optiunile");
        System.out.println("Apasati tasta 4 pentru a termina");

        int alegere = 0;
        boolean run = true;

        while (run) {
            alegere = scanner.nextInt();
            switch (alegere) {
                case 1 -> interior();
                case 2 -> exterior();
                case 3 -> resetare();
                case 4 -> {
                    autoturism.setOptionsList(listaOptiuni);
                    config = false;
                    run = false;
                    autoturism.descriere();
                }
                default -> System.out.println("Ati introdus un numar incorect");
            }
        }
    }

    public void interior() {

        Interior interior = new Interior();

        System.out.println("Selectati tapiteria " + "\n");
        System.out.println("Apasati tasta 1 pentru Alcantara");
        System.out.println("Apasati tasta 2 pentru Piele");
        System.out.println("Apasati tasta 3 pentru Textil");


        int alegere = 0;
        boolean run = true;

        while (true) {
            alegere = scanner.nextInt();
            switch (alegere) {
                case 1:
                    System.out.println("Ati ales Alcantara" + "\n");
                    interior.setTapiterie(Tapiterie.ALCANTARA);
                    break;
                case 2:
                    System.out.println("Ati ales Piele" + "\n");
                    interior.setTapiterie(Tapiterie.PIELE);
                    break;
                case 3:
                    System.out.println("Ati ales material Textil" + "\n");
                    interior.setTapiterie(Tapiterie.TEXTIL);
                    break;
                default:
                    System.out.println("Ati introdus un numar incorect. Incercati din nou.");
            }
            System.out.println("Apasati tasta 4 pentru a adauga Navigatie");
            alegere = scanner.nextInt();
            if (alegere == 4) {
                System.out.println("Ati adaugat cu succes optiunea Navigatie" + "\n");
                interior.setNavigatie(true);
            }
            System.out.println("Apasati tasta 5 pentru a adauga Scaune electrice");
            alegere = scanner.nextInt();
            if (alegere == 5) {
                System.out.println("Ati adaugat cu succes optiunea Scaune electrice" + "\n");
                interior.setScauneElectrice(true);
            }
            System.out.println("Apasati tasta 6 pentru a adauga airbag-uri");
            alegere = scanner.nextInt();
            if (alegere == 6) {
                interior.setAirbaguri(12);
                System.out.println("Ati adaugat cu succes optiunea airbag-uri" + "\n");
            }
            this.listaOptiuni.add(interior);
            System.out.println("Optiunile au fost adaugate pe noua dvs. masina " + "\n");
            configurareMasina();
        }
    }

    public void exterior() {

        Exterior exterior = new Exterior();

        System.out.println("Selectati tipul de jante" + "\n");
        System.out.println("Apasti tasta 1 pentru Jante aliaj");
        System.out.println("Apasati tasta 2 pentru Jante tabla");

        boolean run = true;
        int alegere = 0;

        while (true) {
            alegere = scanner.nextInt();
            switch (alegere) {
                case 1:
                    exterior.setJante(Jante.ALIAJ);
                    System.out.println("Ati selectat Jante Aliaj" + "\n");
                    break;
                case 2:
                    exterior.setJante(Jante.TABLA);
                    System.out.println("Ati selectat Jante Tabla" + "\n");
                    break;
                default:
                    System.out.println("Ati introdus un numar incorect. Incercati din nou.");
            }

            System.out.println("Selectati culoarea" + "\n");
            System.out.println("Apasati tasta 1 pentru negru");
            System.out.println("Apasati tasta 2 pentru alb");
            System.out.println("Apasati tasta 3 pentru rosu");
            System.out.println("Apasati tasta 4 pentru gri");
            System.out.println("Apasati tasta 5 pentru albastru");

            alegere = scanner.nextInt();

            switch (alegere) {
                case 1:
                    exterior.setCuloare("Negru");
                    System.out.println("Ati selectat culoarea Negru" + "\n");
                    break;
                case 2:
                    exterior.setCuloare("Alb");
                    System.out.println("Ati selectat culoarea Alb" + "\n");
                    break;
                case 3:
                    exterior.setCuloare("Rosu");
                    System.out.println("Ati selectat culoarea Rosu" + "\n");
                    break;
                case 4:
                    exterior.setCuloare("Gri");
                    System.out.println("Ati selectat culoarea Gri" + "\n");
                    break;
                case 5:
                    exterior.setCuloare("Albastru");
                    System.out.println("Ati selectat culoarea Albastru" + "\n");
                    break;
                default:
                    System.out.println("Ati introdus un numar incorect. Incercati din nou.");
            }

            System.out.println("Selectati dimensiunea jantei" + "\n");
            System.out.println("Apasati 1 pentru 18'' ");
            System.out.println("Apasati 2 pentru 19'' ");

            alegere = scanner.nextInt();

            switch (alegere) {
                case 1:
                    exterior.setDimensiuneJantaInch(18);
                    System.out.println("Ati selectat dimensiunea 18''" + "\n");
                    break;
                case 2:
                    exterior.setDimensiuneJantaInch(19);
                    System.out.println("Ati selectat dimensiunea 19''" + "\n");
                    break;
                default:
                    System.out.println("Ati introdus un numar incorect. Incercati din nou.");
            }
            System.out.println("Optiunile au fost adaugate pe noua dvs. masina " + "\n");
            this.listaOptiuni.add(exterior);
            meniu();
        }
    }

    public void descriereMasinaCreata() {

        if (config) {
            System.out.println("Nu ati configurat inca o masina. Configurati o masina inainte de a o descrie.");
        } else {
            autoturism.descriere();
        }
    }
        public void descriere() {
            System.out.println("Marca: " + autoturism.getMarca());
            System.out.println("Model: " + autoturism.getModel());
            System.out.println("An fabricatie: " + autoturism.getAnFabricatie());
            System.out.println("Optiuni: ");
            if (listaOptiuni.isEmpty()) {
                System.out.println("Nu sunt optiuni selectate");
            } else {
                for (Optiune optiune : listaOptiuni) {
                    optiune.descriere();
                }
            }
    }

    public void resetare() {
        for (Optiune optiune : listaOptiuni) {
            listaOptiuni.clear();
            optiune.resetare();
        }
    }
}