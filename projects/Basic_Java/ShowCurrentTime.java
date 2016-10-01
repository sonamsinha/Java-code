/**
 * Created by sonamsinha on 9/19/16.
 */

import java.util.Scanner;
public class ShowCurrentTime {

    public static void main(String[] args){
        long totalMilliSeconds;
        long totalSeconds;
        long totalMins;
        long totalHours;
        long curSec;
        long curMin;
        long curHours;
        long offset;
        long offsetSec;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter offset to GMT = ");
        offset = input.nextLong();
        offsetSec = offset * 3600;
        totalMilliSeconds = System. currentTimeMillis();
        totalSeconds = totalMilliSeconds/1000;
        totalSeconds = totalSeconds - offsetSec;

        curSec = totalSeconds%60;
        totalMins = totalSeconds/60;
        curMin = totalMins%60;
        totalHours = totalMins/60;
        curHours = totalHours%24;

        System.out.println("Current time, Hours = " + curHours + " Minutes = " + curMin + " Seconds = "+ curSec );

    }
}
