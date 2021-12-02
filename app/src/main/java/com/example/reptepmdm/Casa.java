package com.example.reptepmdm;

import java.util.ArrayList;

public class Casa extends Vivenda {
    private String pati;
    private String parking;
    private String fasana;

    public Casa(String tipus, int imagen, String localitat, String direccio, String alquiler, String habitacions, String status, String pati, String parking, String fasana) {
        super(tipus, imagen, localitat, direccio, alquiler, habitacions, status);
        this.pati = pati;
        this.parking = parking;
        this.fasana = fasana;
    }

    public String getPati() {
        return pati;
    }

    public String getParking() {
        return parking;
    }

    public String getFasana() {
        return fasana;
    }

    @Override
    public String[] getCaracterístiques() {
        // Total 7 valors
        String[] caracteristiques;
        ArrayList<String> llista = new ArrayList<>();

        llista.add(this.getLocalitat());
        llista.add(this.getHabitacions());
        if (this.getPati().equals("No")) {
            llista.add("Superficie del pati: " + "No te pati");
        } else {
            llista.add("Superficie del pati: " + this.getPati());
        }
        if (this.getParking().equals("No")) {
            llista.add("Superficie del pàrking: " + "No te pàrking");
        } else {
            llista.add("Superficie del parking: " + this.getParking());
        }
        if (this.getFasana().equals("No")) {
            llista.add("Metres de façana: " + "No te façana");
        } else {
            llista.add("Metres de façana: " + this.getFasana());
        }
        if (this.getStatus().equals("No llogat")) {
            llista.add("Aquest pis no està llogat");
            llista.add("");
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
