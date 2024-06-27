package Calories.Converter;

public class Converter {
    // преобразование шагов в километры и килокалории
    // 1 шаг = 75см
    // 1шаг = 50 калорий. 1 килокалория = 1000калорий

    public int convertToKm(int steps) {// перевод кол-ко шагов в километры
        int km = steps * 75 / 100000;
        System.out.println("km = " + km);
        return km;

    }


    public int ConvertStepsToKilocalories(int steps) { //перевод кол-ко шагов в килокалории
        int kilokalories = steps * (1 * 50 / 1000);
        System.out.println("kilokalories = " + kilokalories);
        return kilokalories;
    }


}
