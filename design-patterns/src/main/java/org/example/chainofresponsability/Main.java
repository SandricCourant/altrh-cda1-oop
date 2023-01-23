package org.example.chainofresponsability;

public class Main {
    public static void main(String[] args) {

        // Chain of responsibility
        ErrorHanlderC sophie = new ErrorHanlderC();
        ErrorHandlerA maxime = new ErrorHandlerA();
        ErrorHandlerB annie = new ErrorHandlerB();

        maxime.setNextHandler(annie);
        annie.setNextHandler(sophie);

        // Traitement d'une erreur
        Error error = new Error(500);
        maxime.handleError(error);
    }
}