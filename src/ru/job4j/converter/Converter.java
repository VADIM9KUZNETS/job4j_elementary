package ru.job4j.converter;

/**
 * Class Converter для вычисления курса валют euro, dollar.
 * @author  Vadim Kuznets (9moyapochta9@gmail.com)
 * @since 04.04.2020
 * @version 1
 */

public class Converter {
    /**
     * Method rubleToEuro - Вычиление количества евро.
     * @param value - количество рублей.
     * @return rs1 - рузультат вычисления.
     */

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * Method rubleToDollar - Вычиление количества долларов.
     * @param value - количество рублей.
     * @return - рузультат вычисления.
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Method main - Конструктор, вывода строки в консоль.
     * @param args - args
     */

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
    }
}