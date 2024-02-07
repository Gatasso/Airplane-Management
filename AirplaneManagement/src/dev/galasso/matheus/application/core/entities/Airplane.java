package dev.galasso.matheus.application.core.entities;

public class Airplane {
    private Seat[] allSeats;
    private int sections,chairsPerSection,linesPerSection;

    public Airplane(int sections, int chairsPerSection, int linesPerSection) {
        this.sections = sections;
        this.chairsPerSection = chairsPerSection;
        this.linesPerSection = linesPerSection;
        final int CAPACITY = (this.sections * this.chairsPerSection * this.linesPerSection);
        allSeats = new Seat[CAPACITY];
    }
}
