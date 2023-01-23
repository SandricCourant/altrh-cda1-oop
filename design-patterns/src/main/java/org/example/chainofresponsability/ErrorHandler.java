package org.example.chainofresponsability;

public abstract class ErrorHandler {

    protected ErrorHandler nextHandler;

    public void setNextHandler(ErrorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleError(Error error);
}
