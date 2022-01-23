package org.itstep.ControlWork1901;

import java.util.LinkedList;
import java.util.List;

public class ListOfTour {
    List<Tour> tours = new LinkedList<>();

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    LinkedList<Tour> getByCostOfTransport(double min, double max) {
        List<Tour> result = new LinkedList<>();
        for (Tour tour : tours) {
            if (tour.getCostOfTransport() > min && tour.getCostOfTransport() < max)
            result.add(tour);
        }
        return (LinkedList<Tour>) result;
    }

    LinkedList<Tour> getByNutrition(double min, double max) {
        List<Tour> result = new LinkedList<>();
        for (Tour tour : tours) {
            if (tour.getNutrition() > min && tour.getNutrition() < max)
                result.add(tour);
        }
        return (LinkedList<Tour>) result;
    }

    LinkedList<Tour> getByNumberOfDays(double min, double max) {
        List<Tour> result = new LinkedList<>();
        for (Tour tour : tours) {
            if (tour.getNumberOfDays() > min && tour.getNumberOfDays() < max)
                result.add(tour);
        }
        return (LinkedList<Tour>) result;
    }

    LinkedList<Tour> getByIsFree(boolean state) {
        List<Tour> result = new LinkedList<>();
        for (Tour tour : tours) {
            if (tour.free == true)
                result.add(tour);
        }
        return (LinkedList<Tour>) result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tour: \n");
        for (Tour tour : tours)
            sb.append(tour.toString());
        return sb.toString();
    }
}
