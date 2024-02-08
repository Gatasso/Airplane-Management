package dev.galasso.matheus.application.core.entities;

import dev.galasso.matheus.application.core.exceptions.NotDivisibleArrangementException;

public class Airplane {
    private final Seat[] allSeats;
    private final int chairsPerSection, sections;
    private final double framesOnPlane;

    public Airplane(int sections, int chairsPerSection, int linesPerSection) throws NotDivisibleArrangementException{
        this.sections = sections;
        this.chairsPerSection = chairsPerSection;
        final int CAPACITY = (this.sections * this.chairsPerSection * linesPerSection);
        framesOnPlane = checkDivisionofFrames(CAPACITY, this.sections,this.chairsPerSection);
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
    private double checkDivisionofFrames(int capacity, int sections, int chairsPerSection)throws NotDivisibleArrangementException {
        double result = (capacity/(Math.pow(sections,chairsPerSection)));
        if (result %2 != 0) throw new NotDivisibleArrangementException();
        else return result;
    }
}
