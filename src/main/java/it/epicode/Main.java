package it.epicode;

import it.epicode.models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Dipendente dipendente01 = new Dipendente("123", 1000, Diparimento.PRODUZIONE);
//        Dipendente dipendente02 = new Dipendente("456", 1000, Diparimento.AMMINISTRAZIONE);
//        Dipendente dipendente03 = new Dipendente("789", 1000, Diparimento.VENDITE);

        Dipendente dirigente = new Dirigente("777", 10000, Diparimento.AMMINISTRAZIONE);
        Dipendente dipendenteFullTime = new DipendenteFullTime("123", 1100, Diparimento.AMMINISTRAZIONE);
        Dipendente dipendentePartTime = new DipendentePartTime("987", 10000, Diparimento.AMMINISTRAZIONE, 10);


        Dipendente[] dipendenti = new Dipendente[]{dipendentePartTime, dirigente, dipendenteFullTime};

        //Per ogni dipendente di tipo Dipendente nell'Arrey dipendenti:
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.getMatricola());
            System.out.println(dipendente.calculateSalary());
        }
    }
}

