package dev.galasso.matheus.application.core.exceptions;

import dev.galasso.matheus.application.core.entities.Seat;

public class SeatNotAvailableException extends Exception{
    public SeatNotAvailableException(Seat seat) {
        super("The "+seat+" is already occupied. Please, choose another seat to make a reservation.");
    }
}
