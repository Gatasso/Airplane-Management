package dev.galasso.matheus.application.test;

import dev.galasso.matheus.application.core.entities.Airplane;
import dev.galasso.matheus.application.core.entities.Seat;

public class Main {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane(2,4,20);
        plane1.printSeats();

    }
}