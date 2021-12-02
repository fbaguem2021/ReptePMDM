package com.example.reptepmdm;

import java.util.ArrayList;

public class Atic extends Vivenda {
    private String pis;
    private String porta;
    private String ascensor;
    private String pati;

    public Atic(String tipus, int imagen, String localitat, String direccio, String alquiler, String habitacions, String status, String pis, String porta, String ascensor, String pati) {
        super(tipus, imagen, localitat, direccio, alquiler, habitacions, status);
        this.pis = pis;
        this.porta = porta;
        this.ascensor = ascensor;
        this.pati = pati;
    }

    public String getPis() {
        return pis;
    }

    public String getPorta() {
        return porta;
    }

    public String getAscensor() {
        return ascensor;
    }

    public String getPati() {
        return pati;
    }

    @Override
    public String[] getCaracterístiques() {
        String[] caracteristiques;
        ArrayList<String> llista = new ArrayList<>();

        llista.add(this.getLocalitat());
        llista.add(this.getHabitacions());
        if (this.getAscensor().equals("No")) {
            llista.add(this.getPis() + "rt, " + this.getPorta() + "ª, Sense ascensor");
        } else {
            llista.add(this.getPis() + "rt, " + this.getPorta() + "ª, Amb ascensor");
        }
        llista.add("Superficie del pati: " + this.getPati());

        if (this.getStatus().equals("No llogat")) {
            llista.add("Aquest pis no està llogat");
            llista.add("_____________________");
        } else {
            llista.add(("Aquest pis està llogat"));
            llista.add(this.getStatus());
        }
        caracteristiques = new String[llista.size()];
        int i = 0;
        for (String s : llista) {
            caracteristiques[i] = s;
            i++;
        }
        return caracteristiques;
    }
}
