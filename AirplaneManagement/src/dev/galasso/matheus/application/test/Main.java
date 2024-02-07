package dev.galasso.matheus.application.test;

import dev.galasso.matheus.application.core.entities.Seat;

public class Main {
    public static void main(String[] args) {
        Seat seat = new Seat('A',1);
        System.out.println(seat);
    }
}