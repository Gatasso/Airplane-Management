package dev.galasso.matheus.application.service;

import dev.galasso.matheus.application.core.entities.Seat;

public class SeatMap {
    public SeatMap() {
    }

    public void createSeatMap(Seat[] allSeats, double framesOnPlane, int sectionsOnPlane, int rowsPerSection){
        int x = 0;
        int spaceBTWNSeats = 5;
        String formatSpecifier = "|  %-" + spaceBTWNSeats + "s  ";
        for (int i = 0; i < framesOnPlane; i++) {
            for (int j = 0; j < sectionsOnPlane; j++) {
                for (int k = 0; k < rowsPerSection; k++) {
                    System.out.printf(formatSpecifier, allSeats[x]);
                    x++;
                }
                System.out.print("|         ");
            }
            System.out.println(" ");
        }
    }
}
