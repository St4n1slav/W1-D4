package it.epicode.models;

public abstract class Dipendente implements Cheakinnable {
    private String matricola;
    private double stipendio;
    private Diparimento diparimento;

    public Dipendente(String matricola, double stipendio, Diparimento diparimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.diparimento = diparimento;
    }

    public Dipendente() {
    }

    public abstract double calculateSalary();

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

    @Override
    public void checkIn() {
        System.out.println("Check-in effettuato");
    }
}



