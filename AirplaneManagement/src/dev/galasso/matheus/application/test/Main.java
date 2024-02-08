package dev.galasso.matheus.application.test;

import dev.galasso.matheus.application.core.entities.Airplane;
import dev.galasso.matheus.application.core.entities.Seat;
import dev.galasso.matheus.application.core.exceptions.NotDivisibleArrangementException;

public class Main {
    public static void main(String[] args) throws NotDivisibleArrangementException {
        Airplane plane1 = new Airplane(2,4,20);
        plane1.printSeats();
    }
}