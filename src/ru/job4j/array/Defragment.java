package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                int point = index + 1;
                String tmp = array[index];
                array[index] = array[point];
                array[point] = tmp;
            }
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == null) {
                    int p = i + 1;
                    String tmp = array[i];
                    array[i] = array[p];
                    array[p] = tmp;
                }
            }

                System.out.print(array[index] + " ");

        }
        return array;
    }
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}