package org.example;


import org.example.observer.Observer;
import org.example.observer.TicketCaisseMachine;
import org.example.observer.Vendeur;

public class Main {
    public static void main(String[] args) {

        Vendeur maxime = new Vendeur();
        Observer machine = new TicketCaisseMachine();

        // On ajoute la machine commen abonné de Maxime
        maxime.subscribe(machine);

        maxime.encaisser();
    }
}