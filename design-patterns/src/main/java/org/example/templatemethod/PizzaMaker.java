package org.example.templatemethod;

public abstract class PizzaMaker {

    protected abstract void preparerLaSauce();
    protected abstract void preparerLaPate();
    protected abstract void mettreLaSauceSurLaPate();

    public void faireLaPizza() {
        preparerLaSauce();
        preparerLaPate();
        mettreLaSauceSurLaPate();
    }

}
