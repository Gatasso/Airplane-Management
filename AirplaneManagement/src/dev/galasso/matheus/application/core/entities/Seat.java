package dev.galasso.matheus.application.core.entities;

public class Seat {
    private char section;
    private int place;

    public Seat(char section, int place) {
        this.section = section;
        this.place = place;
    }

    @Override
    public String toString() {
        return " "+section+place+" ";
    }
}
