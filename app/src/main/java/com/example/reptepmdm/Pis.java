package com.example.reptepmdm;

import java.util.ArrayList;

public class Pis extends Vivenda {
    private String pis;
    private String porta;
    private String ascensor;

    public Pis(String tipus, int imagen, String localitat, String direccio, String alquiler, String habitacions, String status, String pis, String porta, String ascensor) {
        super(tipus, imagen, localitat, direccio, alquiler, habitacions, status);
        this.pis = pis;
        this.porta = porta;
        this.ascensor = ascensor;
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

    @Override
    public String toString() {
        return super.toString() + "Pis{" +
                "pis='" + pis + '\'' +
                ", porta='" + porta + '\'' +
                ", ascensor='" + ascensor + '\'' +
                '}';
    }

    @Override
    public String[] getCaracterístiques() {
        String [] caracteristiques;
        ArrayList<String> llista = new ArrayList<>();

        llista.add(this.getLocalitat());
        llista.add(this.getHabitacions());
        if (this.getAscensor().equals("No")) {
            llista.add(this.getPis() + "rt, " + this.getPorta() + "ª, Sense ascensor");
        } else {
            llista.add(this.getPis() + "rt, " + this.getPorta() + "ª, Amb ascensor");
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
        for (String s : llista){
            caracteristiques[i] = s;
            i++;
        }
        return caracteristiques;
    }
}
