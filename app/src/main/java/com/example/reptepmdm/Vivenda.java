package com.example.reptepmdm;

import java.io.Serializable;

public abstract class Vivenda implements Serializable {
    private String tipus;
    private int imagen;
    private String localitat;
    private String direccio;
    private String alquiler;
    private String habitacions;
    private String status;

    public Vivenda(String tipus, int imagen, String localitat, String direccio, String alquiler, String habitacions, String status) {
        this.tipus = tipus;
        this.imagen = imagen;
        this.localitat = localitat;
        this.direccio = direccio;
        this.alquiler = alquiler;
        this.habitacions = habitacions;
        this.status = status;
    }

    public String getTipus() {
        return tipus;
    }

    public int getImagen() {
        return imagen;
    }

    public String getLocalitat() {
        return localitat;
    }

    public String getDireccio() {
        return direccio;
    }

    public String getAlquiler() {
        return alquiler;
    }

    public String getHabitacions() {
        return habitacions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vivenda{" +
                "tipus='" + tipus + '\'' +
                ", imagen=" + imagen +
                ", localitat='" + localitat + '\'' +
                ", direccio='" + direccio + '\'' +
                ", alquiler='" + alquiler + '\'' +
                ", habitacions='" + habitacions + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public abstract String[] getCaracterístiques();
}
