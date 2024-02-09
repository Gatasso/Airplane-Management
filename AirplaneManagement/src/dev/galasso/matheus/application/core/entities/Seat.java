package dev.galasso.matheus.application.core.entities;

public class Seat {
    private boolean isOccupied;
    private final char section;
    private final int place;

    public Seat(char section, int place) {
        this.section = section;
        this.place = place;
        isOccupied = false;
    }

    public void setOccupied() {
        isOccupied=true;
    }

    @Override
    public String toString() {
        return " "+section+place+" ";
    }
}
