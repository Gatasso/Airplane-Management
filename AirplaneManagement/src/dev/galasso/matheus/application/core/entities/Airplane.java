package dev.galasso.matheus.application.core.entities;

public class Airplane {
    private final Seat[] allSeats;
    private final int sections;
    private final int chairsPerSection;
    private final double framesOnPlane;

    public Airplane(int sections, int chairsPerSection, int linesPerSection) {
        this.sections = sections;
        this.chairsPerSection = chairsPerSection;
        final int CAPACITY = (this.sections * this.chairsPerSection * linesPerSection);
        framesOnPlane = CAPACITY/(Math.pow(this.sections,this.chairsPerSection));
        allSeats = new Seat[CAPACITY];
        createAllSeats();
    }

    private void createAllSeats(){
        int counter = 0;
        char frameCounter = 'A';
        for (int i = 0; i < framesOnPlane; i++) {
            for (int j = 0; j < Math.pow(this.sections,this.chairsPerSection); j++) {
                allSeats[counter] = new Seat(frameCounter,j+1);
                counter++;
            }frameCounter++;
        }
    }
    public void printSeats(){
        for (Seat seat : allSeats) {
            System.out.println(seat);
        }

    }
}
