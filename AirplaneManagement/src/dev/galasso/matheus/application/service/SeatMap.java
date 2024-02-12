package dev.galasso.matheus.application.service;

import dev.galasso.matheus.application.core.entities.Seat;

public class SeatMap {
    private String[][] seatMap;
    private int sectionBreak;

    public SeatMap() {
    }

    public void createSeatMap(Seat[] allSeats, double framesOnPlane, int sectionsOnPlane, int chairsPerSection) {
        seatMap = new String[(int) framesOnPlane][chairsPerSection * sectionsOnPlane];
        sectionBreak = chairsPerSection;
        int x = 0;
        int spaceBTWNSeats = 5;
        String formatSpecifier = "|  %-" + spaceBTWNSeats + "s  ";
        for (int i = 0; i < framesOnPlane; i++) {
            for (int j = 0; j < sectionsOnPlane; j++) {
                for (int k = 0; k < chairsPerSection; k++) {
                    int index = (j * chairsPerSection) + k;
                    seatMap[i][index] = String.format(formatSpecifier, allSeats[x]);
                    x++;
                }
            }
        }
    }

    public void printSeatMap() {
        int x = 0;
        for (String[] strings : seatMap) {
            for (String string : strings) {
                System.out.print(string);
                x++;
                if (x == sectionBreak) {
                    System.out.print("|        ");
                    x = 0;
                }
            }
            System.out.println();
        }
    }
}
