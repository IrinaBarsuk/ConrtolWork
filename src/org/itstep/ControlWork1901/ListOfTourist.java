package org.itstep.ControlWork1901;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListOfTourist {
    List<Tourist> tourists = new LinkedList<>();

    public void addTourist(Tourist tourist) {
        tourists.add(tourist);
    }

    LinkedList<Tourist> getTouristOnHoliday(String s1) throws ParseException {
        List<Tourist> result = new LinkedList<>();
        for (Tourist tourist : tourists) {
            String s2 = tourist.getsHolidayDate();
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Date date1 = format.parse(s1);
            Date date2 = format.parse(s2);
            if (date1.compareTo(date2) == 0)
                result.add(tourist);
        }
        return (LinkedList<Tourist>) result;
    }

}


