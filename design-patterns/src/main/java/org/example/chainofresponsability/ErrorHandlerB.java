package org.example.chainofresponsability;

public class ErrorHandlerB extends ErrorHandler {

    @Override
    public void handleError(Error error) {
        if (error.getCode() == 403) {
            System.out.println("Traitement de l'interdiction");
        } else {
            this.nextHandler.handleError(error);
        }
    }
}
