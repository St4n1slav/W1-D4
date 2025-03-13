package it.epicode;

import it.epicode.models.Diparimento;
import it.epicode.models.Dipendente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Dipendente dipendente01 = new Dipendente("123", 1000, Diparimento.PRODUZIONE);
       Dipendente dipendente02 = new Dipendente("456", 1000, Diparimento.AMMINISTRAZIONE);
       Dipendente dipendente03 = new Dipendente("789", 1000, Diparimento.VENDITE);

       Dipendente[] dipendenti = new Dipendente[] {dipendente01, dipendente02, dipendente03};

       //Per ogni dipendente di tipo Dipendente nell'Arrey dipendenti:
       for (Dipendente dipendente : dipendenti) {
           System.out.println(dipendente.getMatricola());

       }
    }
}

