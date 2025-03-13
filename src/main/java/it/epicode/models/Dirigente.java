package it.epicode.models;

public class Dirigente extends Dipendente {

    public Dirigente(String matricola, double stipendio, Diparimento diparimento) {
        super(matricola, stipendio, diparimento);
    }

    @Override
    public double calculateSalary() {
        return 10000;
    }
}
