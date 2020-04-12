package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length);

            for (index = 0; index < i; index++) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }

        }
        return data;
    }
}

