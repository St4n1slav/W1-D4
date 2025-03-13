package it.epicode.models;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private Diparimento diparimento;


    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Diparimento getDiparimento() {
        return diparimento;
    }

    public void setDiparimento(Diparimento diparimento) {
        this.diparimento = diparimento;
    }

    public Dipendente(String matricola, double stipendio, Diparimento diparimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.diparimento = diparimento;
    }

    public Dipendente() {
    }
}



