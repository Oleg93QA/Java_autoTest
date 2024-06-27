package Calories.StepTracker;

import Calories.Converter.Converter;
import Calories.MonthData.MonthData;

import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    private int goalByStepsPerDay = 10000; // цель шагов
    Converter kiloKm = new Converter();


    public StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public int getGoalByStepsPerDay() {
        return goalByStepsPerDay;
    }

    public void setGoalByStepsPerDay(int goalByStepsPerDay) {
        this.goalByStepsPerDay = goalByStepsPerDay;
    }


    public void addNewNumberStepsPerDay() {
        // Scanner scanner = new Scanner(System.in);
        System.out.println("input  numer month");
        int month = scanner.nextInt();
        System.out.println("вы ввели номер месяца = " + month);
        if (month < 1 || month > 12) {
            System.out.println(" error");
            scanner.close();
            return;
        }


        System.out.println("input day 1 to 30");
        int day = scanner.nextInt();
        System.out.println("вы ввели день месяца = " + day);
        if (day < 1 || day > 30) {
            System.out.println(" error");
            scanner.close();
            return;
        }

        System.out.println("input steps");
        int step = scanner.nextInt();
        System.out.println("вы ввели шагов = " + step);
        if (step < 1) {
            System.out.println(" error");
            scanner.close();
            return;
        }


        MonthData monthData = monthToData[month - 1];
        monthData.setSteps(day, step);

    }


    public void changeStepGoal() { //изменение цели по шагам в день
        System.out.println("введите цель по шагам в день");
        int goal = scanner.nextInt();
        if (goal <= 0) {
            System.out.println("error");
        } else if (goal > 0) {
            setGoalByStepsPerDay(goal);
            System.out.println("цель установлен на " + goalByStepsPerDay + " шагах");
        }
    }


    public void printStatistic() {
        System.out.println("input number month");
        MonthData monthData = new MonthData();
        Scanner cs = new Scanner(System.in);
        int month = cs.nextInt();
        monthData = monthToData[month - 1];

        int sumStep = monthData.sinStepsFromMonth();

        monthData.printDaysAndStepsFromMonth();
        monthData.sinStepsFromMonth();
        monthData.maxSteps();

        int srednee = sumStep / 30;

        kiloKm.convertToKm(sumStep);
        kiloKm.ConvertStepsToKilocalories(sumStep);

        monthData.bestSeries(goalByStepsPerDay);
        System.out.println("summa steps =" + sumStep + "srednee = " + srednee);
        System.out.println("\n");
    }


    public int getStepsForDay(int month, int day) {  // Метод для получения шагов за определенный день в определенный месяц
        if (month >= 1 && month <= 12) {
            return monthToData[month - 1].getSteps(day);
        } else {
            System.out.println("Неверный номер месяца.");
            return -1;
        }
    }
}
