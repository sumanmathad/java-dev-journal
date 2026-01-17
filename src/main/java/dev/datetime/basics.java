package dev.datetime;

import com.sun.jdi.PathSearchingVirtualMachine;
import org.junit.Test;

import java.time.*;

public class basics {

    public static void main(String[] args) {
        Instant in = Instant.now();
        System.out.println(in);

        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());


    }

    @Test
    public void dateMethods(){

        var date1= LocalDate.of(1991,8,5);
        var date2 = LocalDate.of(1991,Month.AUGUST,5);

        System.out.println(date1);
        System.out.println(date2);
    }

    @Test
    public void timeMethods() {
        var time1 = LocalTime.of(2,25,25);
        var time2=LocalTime.now();
        var time3=LocalTime.of(2,25,25,2222);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

    }


    @Test
    public void datetimeMethods() {

        var datetime1 = LocalDateTime.now();
        var datetime2= LocalDateTime.of(1991,8,5,11,0,0,200);
        System.out.println(datetime1);
        System.out.println(datetime2);

    }


    @Test
    public void zoneMethods() {

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2025, 1, 20,
                6, 15, 30, 200, zone);

        System.out.println(zone);
        System.out.println(zoned1);



    }


}
