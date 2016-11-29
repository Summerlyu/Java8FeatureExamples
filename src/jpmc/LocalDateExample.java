package jpmc;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * Created by lvdandan on 29/11/2016.
 */
public class LocalDateExample {
    public static void main (String args []){

        /**
         * LocalDateExample examples
          */
        java.time.LocalDate today = java.time.LocalDate.now();
        System.out.println("Current date: " + today);

        java.time.LocalDate firstDay_2015 = java.time.LocalDate.of(2015, Month.JANUARY, 1);
        System.out.println("The first day of 2015 is: " + firstDay_2015);

        //LocalDateExample feb29_2014 = LocalDateExample.of(2014, Month.FEBRUARY, 29);
        java.time.LocalDate todayChina = java.time.LocalDate.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("Today's date in China is: " + todayChina);

        java.time.LocalDate dateFromBase = java.time.LocalDate.ofEpochDay(100000);
        System.out.println("365th day from base date= "+dateFromBase);


        java.time.LocalDate dateFromYear = java.time.LocalDate.ofYearDay(1993, 234);
        System.out.println("1993 234 days: " + dateFromYear);

        /**
         * LocalTimeExample examples
         */

    }

}
