package dev.galasso.matheus.application.test;

import dev.galasso.matheus.application.core.entities.Airplane;
import dev.galasso.matheus.application.core.exceptions.NotDivisibleArrangementException;

public class Main {
    public static void main(String[] args) throws NotDivisibleArrangementException {
        new Airplane(4,2,40);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        new Airplane(2,4,20);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        new Airplane(3,3,18);

    }
}