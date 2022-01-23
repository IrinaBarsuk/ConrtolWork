package org.itstep.ControlWork1901;

public class Tour {

    protected String nameOfTour;
    protected double costOfTransport;
    protected int nutrition;
    protected int numberOfDays;
    protected boolean free;

    public Tour(String nameOfTour, double costOfTransport, int nutrition, int numberOfDays, boolean free) {

        this.nameOfTour = nameOfTour;
        this.costOfTransport = costOfTransport;
        this.nutrition = nutrition;
        this.numberOfDays = numberOfDays;
        this.free = free;
    }


    public String getNameOfTour() {
        return nameOfTour;
    }

    public double getCostOfTransport() {
        return costOfTransport;
    }

    public int getNutrition() {
        return nutrition;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public boolean isFree() {
        return free;
    }
}


























