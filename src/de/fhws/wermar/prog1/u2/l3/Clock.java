package de.fhws.wermar.prog1.u2.l3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author wermar
 */
public class Clock {

    public static final double SECONDS_PER_DAY = 86400.0;

    public static void main(String[] args) {
        var hours = 20;
        var minutes = 30;
        var seconds = 30;

        var secondsSinceMidnight = (60 * hours * 60) + (minutes * 60) + seconds;
        var secondsToNextMidnight = ((24 - hours) * 60 * 60) + ((60 - minutes) * 60) + (60 - seconds);
        var percentageOfDay = secondsSinceMidnight * 100.0 / SECONDS_PER_DAY;

        System.out.println("@@@@@ Manual Calculation of Time @@@@@");
        System.out.println("Seconds since Midnight: " + secondsSinceMidnight);
        System.out.println("Seconds to next Midnight:  " + secondsToNextMidnight);
        System.out.println("Percentage of Day:  " + percentageOfDay);
        System.out.println();
        System.out.println("----------------------");

        var currentTime = LocalTime.now();
        var currentSecondsSinceMidnight = currentTime.toSecondOfDay();
        System.out.println("Seconds of Day: " + currentSecondsSinceMidnight);
        System.out.println("Seconds to next Midnight: " + currentTime.until(LocalTime.MAX, ChronoUnit.SECONDS));
        System.out.println("Percentage of Day:  " + (currentSecondsSinceMidnight * 100.0 / SECONDS_PER_DAY));
    }
}
