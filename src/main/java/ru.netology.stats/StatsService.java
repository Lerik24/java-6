package ru.netology.stats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0; //
        for (int i = 0; i < purchases.length; i++) {
            sum = sum + purchases[i];
        }
        return sum;
    }


    public long calculateAverageMonthlySales(long[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }


    public int maxMonthSales(long[] purchases) {
        long maxSales = 0;
        int monthNum = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (maxSales <= purchases[i]) {
                maxSales = purchases[i];
                monthNum = i;
            }

        }
        return monthNum + 1;
    }

    public int minMonthSales(long[] purchases) {
        long minSales = purchases[0];
        int monthNum = 0;
        for (int i = 0; i < purchases.length; i++) { // for( 0 ; 11 ; ++)
            if (minSales >= purchases[i]) {
                minSales = purchases[i];
                monthNum = i;
            }

        }
        return monthNum + 1;
    }

    public int monthsWithMinSales(long[] purchases) {
        int months = 0;
        long average = calculateAverageMonthlySales(purchases);
        for (int i = 0; i < purchases.length; i++) { // for( 0 ; 11 ; ++)
            if (purchases[i] < average) {
                months = months+1;
            }

        }
        return months;
    }
    public int monthsWithMaxSales(long[] purchases) {
        int months = 0;
        long average = calculateAverageMonthlySales(purchases);
        for (int i = 0; i < purchases.length; i++) { // for( 0 ; 11 ; ++)
            if (purchases[i] > average) {
                months = months+1;
            }

        }
        return months;
    }
}


