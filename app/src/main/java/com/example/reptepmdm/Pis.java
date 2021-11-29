package com.example.reptepmdm;

public class Pis extends Vivenda {
    private String pis;
    private String porta;
    private String ascensor;

    public Pis(String tipus, int imagen, String localitat, String direccio, String alquiler, String habitacions, String status, String  pis, String  porta, String  ascensor) {
        super(tipus, imagen, localitat, direccio, alquiler, habitacions, status);
        this.pis = pis;
        this.porta = porta;
        this.ascensor = ascensor;
    }

    @Override
    public String getCaracterístiques() {
        return null;
    }
}
