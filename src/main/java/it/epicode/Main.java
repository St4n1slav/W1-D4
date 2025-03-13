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
        Volontario volontario = new Volontario("Luca", 20, "yes");

        Dipendente[] dipendenti = new Dipendente[]{dipendentePartTime, dirigente, dipendenteFullTime};
        Cheakinnable[] dipendenti2 = new Cheakinnable[]{dipendentePartTime, dirigente, dipendenteFullTime, volontario};

        //Per ogni dipendente di tipo Dipendente nell'Arrey dipendenti:
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.getMatricola());
            System.out.println(dipendente.calculateSalary());
        }
        for (Cheakinnable cheakinnable : dipendenti2) {
            cheakinnable.checkIn();
        }
    }
}

