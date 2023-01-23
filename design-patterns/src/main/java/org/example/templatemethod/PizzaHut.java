package org.example.templatemethod;

public class PizzaHut extends PizzaMaker {
    @Override
    protected void preparerLaSauce() {
        System.out.println("Utiliser la machine pour la sauce");
    }

    @Override
    protected void preparerLaPate() {
        System.out.println("Appeler le fournisseur pour la pate");
    }

    @Override
    protected void mettreLaSauceSurLaPate() {
        System.out.println("Mettre la sauce avec la louche");
    }
}
