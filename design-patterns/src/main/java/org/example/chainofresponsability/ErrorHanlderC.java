package org.example.chainofresponsability;

public class ErrorHanlderC extends ErrorHandler {
    @Override
    public void handleError(Error error) {
        System.out.println("Contacter service technique");
    }
}
