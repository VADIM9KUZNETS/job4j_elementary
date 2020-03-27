package ru.job4j.condition;

public class Max {
    public static int max(int lef, int righ) {
        int result = righ > lef ? righ : lef;
        return result;    }
}