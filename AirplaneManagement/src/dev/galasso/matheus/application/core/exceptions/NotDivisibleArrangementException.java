package dev.galasso.matheus.application.core.exceptions;

public class NotDivisibleArrangementException extends Exception{
    public NotDivisibleArrangementException() {
        super("The divisions of seats per frame are not equal.\nPlease, check the number of lines again.");
    }
}
