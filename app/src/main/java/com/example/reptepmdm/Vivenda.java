package com.example.reptepmdm;

public abstract class Vivenda {
    private String tipus;
    private int imagen;
    private String localitat;
    private String direccio;
    private String alquiler;
    private String habitacions;
    private String status;

    public Vivenda(String tipus, int imagen, String localitat, String direccio, String alquiler, String habitacions, String status) {
        this.tipus          = tipus;
        this.localitat      = localitat;
        this.direccio       = direccio;
        this.alquiler       = alquiler;
        this.habitacions    = habitacions;
        this.status         = status;
    }
    public abstract String getCaracterístiques();
}
