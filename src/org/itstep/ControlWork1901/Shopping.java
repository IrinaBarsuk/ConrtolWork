package org.itstep.ControlWork1901;

class Shopping extends Tour {

    public Shopping(String nameOfTour, double costOfTransport, int nutrition, int numberOfDays, boolean free) {
        super(nameOfTour, costOfTransport, nutrition, numberOfDays, free);
    }

    @Override
    public String toString() {
        String result = String.format("Tour name: %s, transport cost : %.2f, nutrition: %d, " +
                        "number of days: %d, free: %b%n", getNameOfTour(), getCostOfTransport(), getNutrition(),
                getNumberOfDays(), isFree());
        return result;
    }
}
