package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length - 1);
            int tmp = data[index];
            data[index] = data[i];
            data[i] = tmp;
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    min = MinDiapason.findMin(data, 0, data.length - 1);
                    index = FindLoop.indexOf(data, min, 0, data.length - 1);
                    int tmt = data[index];
                    data[index] = data[j];
                    data[j] = tmt;
                }
            }

//swap(...)
        }
        return data;
    }
}