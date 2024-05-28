package edu.rit.Unit9.inner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Calendar {

    public enum DayOfWeek {

        SUNDAY(1, "Sun"),
        MONDAY(2, "Mon"),
        TUESDAY(3, "Tue"),
        WEDNESDAY(4, "Wed"),
        THURSDAY(5, "Thu"),
        Friday(6, "Fri"),
        SATURDAY(7, "Sat");

        private final int number;
        private final String shortName;
        private static final Map<DayOfWeek, DayOfWeek> NEXT_DAYS = new HashMap<>();

        DayOfWeek(int number, String shortName) {
            this.number = number;
            this.shortName = shortName;
        }

        @Override
        public String toString() {
            return this.shortName;
        }

        public DayOfWeek tomorrow() {
            return NEXT_DAYS.get(this);
        }

        static {
            NEXT_DAYS.put(SUNDAY, MONDAY);
            NEXT_DAYS.put(MONDAY, TUESDAY);
            NEXT_DAYS.put(TUESDAY, WEDNESDAY);
            NEXT_DAYS.put(WEDNESDAY, THURSDAY);
            NEXT_DAYS.put(THURSDAY, Friday);
            NEXT_DAYS.put(Friday, SATURDAY);
            NEXT_DAYS.put(SATURDAY, SUNDAY);
        }
    }
    public enum Month implements Iterable<DayOfWeek> {
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);

        private final int daysInMonth;
        private DayOfWeek startDay;

        private static final Map<Month, Month> NEXT_MONTHS = new HashMap<>();

        static {
            NEXT_MONTHS.put(JANUARY, FEBRUARY);
            NEXT_MONTHS.put(FEBRUARY, MARCH);
            NEXT_MONTHS.put(MARCH, APRIL);
            NEXT_MONTHS.put(APRIL, MAY);
            NEXT_MONTHS.put(MAY, JUNE);
            NEXT_MONTHS.put(JUNE, JULY);
            NEXT_MONTHS.put(JULY, AUGUST);
            NEXT_MONTHS.put(AUGUST, SEPTEMBER);
            NEXT_MONTHS.put(SEPTEMBER, OCTOBER);
            NEXT_MONTHS.put(OCTOBER, NOVEMBER);
            NEXT_MONTHS.put(NOVEMBER, DECEMBER);
            NEXT_MONTHS.put(DECEMBER, JANUARY);
        }

        public Month nextMonth() {
            return NEXT_MONTHS.get(this);
        }

        public void setStartDay(DayOfWeek startDay) {
            this.startDay = startDay;
        }

        Month(int daysInMonth) {
            this.daysInMonth = daysInMonth;
            this.startDay = DayOfWeek.SUNDAY;
        }

        @Override
        public String toString() {
            return this.name().toLowerCase().substring(0, 3);
        }

        @Override
        public Iterator<DayOfWeek> iterator() {
            return new Iterator<DayOfWeek>() {
                private DayOfWeek day = startDay;
                private int dayCounter = 1;

                @Override
                public boolean hasNext() {
                    return dayCounter <= daysInMonth;
                }

                @Override
                public DayOfWeek next() {
                    DayOfWeek temp = day;
                    dayCounter++;
                    day = day.tomorrow();
                    return temp;
                }
            };
        }

    }

    public static DayOfWeek printMonth (Month month, DayOfWeek startDay) {
        month.setStartDay (startDay);
        DayOfWeek lastDay = null;
        int counter = 1;
        System.out.println (month.name ());
        for (int i = 0; i < startDay.number; i++) {
            System.out.print (String.format("%7s", ""));
            counter++;
        }

        int dayNumber = 1;
        for (DayOfWeek day : month) {
            String out = dayNumber + "-" + day + " ";
            System.out.print (String.format("%7s", out));
            if (counter % 7 == 0) {
                System.out.println ();
            }
            lastDay = day;
            counter++;
            dayNumber++;
        }
        if (--counter % 7 != 0) {
            System.out.println ();
        }
        System.out.println ();
        return lastDay.tomorrow ();
    }

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.TUESDAY;
        System.out.println(today);

//        for (DayOfWeek day: Month.MAY) {
//            System.out.println(day.number +" " + day.shortName);
//        }

        printMonth(Month.MAY,DayOfWeek.WEDNESDAY);
    }
}
