package com.course.buildings;

public class House extends Building {
    private int numberOfBathrooms;
    private int numberOfBedrooms;

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return this.numberOfBathrooms;
    }

    public int getNumberOfBedrooms() {
        return this.numberOfBedrooms;
    }
}
