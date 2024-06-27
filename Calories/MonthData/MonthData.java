package Calories.MonthData;

import java.util.Scanner;

public class MonthData {
    private int[] days = new int[30];

    public int getSteps(int day) {
        if (day >= 1 && day <= days.length) {
            System.out.println("шаги за день" + day + " - " + days[day - 1]);
            return days[day - 1];
        } else {
            System.out.println("Неверный номер дня");
            return -1;
        }
    }


    public void setSteps(int day, int steps) {
        if (day >= 1 && day <= days.length) {
            days[day - 1] = steps;
            System.out.println(days);
        } else {
            System.out.println("Неверный номер дня");
        }
    }


    public void printDaysAndStepsFromMonth() { // вывод на экран элементов массива
        // в необходимом формате
        for (int i = 0; i < days.length; i++) {
            System.out.println("day" + (i + 1) + ":" + days[i]);
        }
    }

    public int sinStepsFromMonth() { //сумма всех шагов за месяц
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps += days[i];
        }
        System.out.println("summa everyone steps =" + sumSteps);
        return sumSteps;


    }

    public int maxSteps() { //максимальное количество шагов
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        System.out.println("max steps = " + maxSteps);
        return maxSteps;
    }

    public int bestSeries(int goalByStepsPerDay) { // метод возвращает количество дней,
        // у которых было
        // больше или равное целевого

        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries++;
                if (currentSeries >= finalSeries) {
                    finalSeries = currentSeries;
                }
                System.out.println(" final series = " + currentSeries);
            } else {
                currentSeries = 0;
            }
        }

        return finalSeries;

    }


}
