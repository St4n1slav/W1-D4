package it.epicode.models;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(String matricola, double stipendio, Diparimento diparimento) {
        super(matricola, stipendio, diparimento);
    }

    @Override
    public double calculateSalary() {
        return 1100;
    }
}
