package dev.galasso.matheus.application.core.entities;

import dev.galasso.matheus.application.core.exceptions.NotDivisibleArrangementException;
import dev.galasso.matheus.application.service.SeatMap;

public class Airplane {
    private final Seat[] allSeats;
    private SeatMap seatMap;
    private final int chairsPerSection, sections;
    private final double framesOnPlane;

    public Airplane(int sections, int chairsPerSection, int linesPerSection) throws NotDivisibleArrangementException{
        this.sections = sections;
        this.chairsPerSection = chairsPerSection;
        final int CAPACITY = (this.sections * this.chairsPerSection * linesPerSection);
        allSeats = new Seat[CAPACITY];
        framesOnPlane = checkDivisionOfFrames(CAPACITY, this.sections,this.chairsPerSection);
        seatMap = new SeatMap();
        createAllSeats();

    }

    private void createAllSeats(){
        int counter = 0;
        char frameCounter = 'A';
        for (int i = 0; i < framesOnPlane; i++) {
            for (int j = 0; j < Math.pow(sections,chairsPerSection); j++) {
                allSeats[counter] = new Seat(frameCounter,j+1);
                counter++;
            }frameCounter++;
        }seatMap.createSeatMap(allSeats, framesOnPlane, this.sections, this.chairsPerSection);


    }
    public void printSeats(){
        for (Seat seat : allSeats) {
            System.out.println(seat);
        }
    }
    private double checkDivisionOfFrames(int capacity, int sections, int chairsPerSection)throws NotDivisibleArrangementException {
        double result = (capacity/(Math.pow(sections,chairsPerSection)));
        if (result %2 != 0) throw new NotDivisibleArrangementException();
        else return result;
    }
}
