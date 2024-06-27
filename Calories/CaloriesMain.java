package Calories;

import Calories.MonthData.MonthData;
import Calories.StepTracker.StepTracker;

import java.util.Scanner;

public class CaloriesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonthData monthData = new MonthData();
        StepTracker stepTracker = new StepTracker(scanner);


        while (true) {
            stepTracker.addNewNumberStepsPerDay();
            printMenu();
            System.out.println("input number of menu");
            System.out.println("1. вывод кол-во шагов за опр. день\n" +
                    "2.изменить цель по кол-ву шагов в день \n" +
                    "3.статистика за опр. месяц\n" + "4.выход из приложения \n");
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("Выполнена команда 1");
                System.out.println("введите mont and day");
                int month = scanner.nextInt();
                int dayOfMonth = scanner.nextInt();
                int steps = stepTracker.getStepsForDay(month, dayOfMonth);
                System.out.println("кол-во шагов в опр.день" + steps);
            } else if (i == 2) {
                System.out.println("Выполнена команда 2");
                stepTracker.changeStepGoal();
            } else if (i == 3) {
                System.out.println("Выполнена команда 3");
                stepTracker.printStatistic();
            } else if (i == 4) {
                System.out.println("exit");
                scanner.close();
                return;
            } else {
                System.out.println("такой команды нет");
            }

        }


    }


    public static void printMenu() {
    }


}



