package org.itstep.ControlWork1901;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tourist implements Comparable<Tourist>{
    private String name;
    private String surname;
    private Date holidayDate;
    private String sHolidayDate;


    public Tourist (String name, String surname, String sHolidayDate) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.sHolidayDate = sHolidayDate;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.holidayDate = dateFormat.parse(sHolidayDate);
    }

        @Override
        public int compareTo(Tourist tourist) {
            Date date1 = this.getHolidayDate();
            Date date2 = tourist.getHolidayDate();
            return date1.compareTo(date2);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public String getsHolidayDate() {
        return sHolidayDate;
    }

    @Override
    public String toString() {
        String result = String.format("Name of tourist: %s, surname of tourist: %s, holiday date: %s%n",
                getName(), getSurname(), getsHolidayDate());

        return result;
    }
}
