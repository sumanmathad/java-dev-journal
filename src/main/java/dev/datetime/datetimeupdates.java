package dev.datetime;


import org.junit.Test;

import java.time.*;

public class datetimeupdates {


    @Test
    public void dateupdates(){
        var date = LocalDate.of(2025, Month.JANUARY, 20);
        System.out.println(date);
        //The date and time classes are immutable.
        System.out.println(date.plusDays(2));
        System.out.println(date.plusWeeks(2));
        System.out.println(date.plusYears(2));
        System.out.println(date.plusMonths(2));




    }



}
