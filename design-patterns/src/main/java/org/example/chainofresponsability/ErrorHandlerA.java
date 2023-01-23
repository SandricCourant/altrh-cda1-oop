package org.example.chainofresponsability;

public class ErrorHandlerA extends ErrorHandler {
    @Override
    public void handleError(Error error) {

        if (error.getCode() == 404) {
            System.out.println("Je traite l'erreur 404");
        } else {
            this.nextHandler.handleError(error);
        }
    }
}
