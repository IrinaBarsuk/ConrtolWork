package org.itstep.ControlWork1901;

/*Туристические путевки.
  Сформировать набор предложений клиенту по выбору туристической путевки
  различного типа (отдых, экскурсии, лечение, шопинг) для оптимального выбора.
  Учитывать возможность выбора стоимости транспорта, питания и числа дней.
  Вывести список свободных путевок по выбранным критериям.
  Вывести список туристов, находящихся в указанное время на отдыхе. как отсортировать события по дате  ???*/

import java.text.ParseException;
import java.util.LinkedList;

public class TouristVouchers {
    public static void main(String[] args) throws ParseException {

        ListOfTour listOfTour = new ListOfTour();
        listOfTour.addTour(new Excursion("Moscow", 200.00, 1, 5, true));
        listOfTour.addTour(new Excursion("Minsk", 90.50, 2, 2, false));
        listOfTour.addTour(new Rest("Mexico", 1500.50, 3, 12,true));
        listOfTour.addTour(new Rest("Spain", 650.80, 3, 10, false));
        listOfTour.addTour(new Therapy("Hospital", 50, 5, 12, true));
        listOfTour.addTour(new Therapy("Clinic", 80, 5, 15, false));
        listOfTour.addTour(new Shopping("Italy", 400.6, 1, 3, true));
        listOfTour.addTour(new Shopping("Monaco", 600, 0, 4, false));
        //System.out.println(listOfTour);

        LinkedList<Tour> tours1 = listOfTour.getByCostOfTransport(100,500);
        System.out.println(tours1.toString());

        LinkedList<Tour> tours2 = listOfTour.getByNumberOfDays(10, 15);
        System.out.println(tours2.toString());

        LinkedList<Tour> tours3 = listOfTour.getByNutrition(0, 3);
        System.out.println(tours3.toString());

         LinkedList<Tour> tours4 = listOfTour.getByIsFree(true);
        System.out.println(tours4.toString());

        ListOfTourist listOfTourist = new ListOfTourist();
        listOfTourist.addTourist(new Tourist("Ivan", "Ivanov", "22.01.2022"));
        listOfTourist.addTourist(new Tourist("Petr", "Petrov", "07.10.2022"));
        listOfTourist.addTourist(new Tourist("Maria", "Bobrova", "07.10.2022"));
        listOfTourist.addTourist(new Tourist("Maxim", "Maximov", "14.03.2022"));

        LinkedList<Tourist> touristOnHoliday = listOfTourist.getTouristOnHoliday("07.10.2022");
        System.out.println(touristOnHoliday.toString());
    }

}

