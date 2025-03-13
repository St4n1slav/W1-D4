package it.epicode.models;

import it.epicode.utils.Constants;

public class DipendentePartTime extends Dipendente {
    private final int oreLavorate;

    public DipendentePartTime(String matricola, double stipendio, Diparimento diparimento, int oreLavorate) {
        super(matricola, stipendio, diparimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return Constants.TARIFFA_ORA * oreLavorate;
    }
}
