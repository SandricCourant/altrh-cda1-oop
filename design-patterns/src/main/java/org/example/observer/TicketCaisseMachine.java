package org.example.observer;

public class TicketCaisseMachine implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("Edition d'un ticket de caisse ...");
    }
}
