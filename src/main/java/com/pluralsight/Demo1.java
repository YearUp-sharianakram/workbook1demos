package com.pluralsight;

public class Demo1 {
    public static void main(String[] args){
        char status = 's';
        int identifier = 1;
        String name = "Sharian";
        int daysOfWeekOfTV = 5;
        int minPerDayWatched = 80;
        int minPerWeek = daysOfWeekOfTV * minPerDayWatched;
        int minPerYear = minPerWeek * 52;

        int hoursPerYear = minPerYear / 60;

        String statement = "Sharian Spends " + hoursPerYear + " wasting time on TV";
        System.out.println(statement);


    }
}
