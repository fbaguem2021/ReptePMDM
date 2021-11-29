package com.example.reptepmdm;

public class Atic extends Vivenda {
    private String planta;
    private String porta;
    private String ascensor;
    private String pati;

    public Atic(String tipus, int imagen, String localitat, String direccio, String alquiler, String habitacions, String status, String planta, String porta, String ascensor, String pati) {
        super(tipus, imagen, localitat, direccio, alquiler, habitacions, status);
        this.planta = planta;
        this.porta = porta;
        this.ascensor = ascensor;
        this.pati = pati;
    }

    @Override
    public String getCaracterístiques() {
        return null;
    }
}
