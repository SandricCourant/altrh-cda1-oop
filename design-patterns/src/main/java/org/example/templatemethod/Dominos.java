package org.example.templatemethod;

public class Dominos extends PizzaMaker {
    @Override
    protected void preparerLaSauce() {
        System.out.println("Preparer la sauce avec les dents");
    }

    @Override
    protected void preparerLaPate() {
        System.out.println("Preparer la pate avec les mains");
    }

    @Override
    protected void mettreLaSauceSurLaPate() {
        System.out.println("Mettre la sauce avec une cuillere");
    }
}
