package jpmc;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * Created by lvdandan on 29/11/2016.
 */
public class LocalTimeExample {
    public static void main(String args[]) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time="+time);

        LocalTime specificTime = LocalTime.of(12,20,25,40);
        System.out.println("Specific Time of Day="+specificTime);

        LocalTime timeShanghai = LocalTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("The time in shanghai: " + timeShanghai);

        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time= "+specificSecondTime);

        System.out.println(LocalTime.NOON);

    }
}
