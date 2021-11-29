package com.example.reptepmdm;

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

    @Override
    public String getCaracterístiques() {
        return null;
    }
}
