package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Vendeur implements Subject {
    private List<Observer> observers;

    public Vendeur() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public void encaisser() {
        System.out.println("J'encaisse ... fini!");
        notifyObservers();
    }
}
