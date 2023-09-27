package Homework.sort;

public class ArraySort {
    public void sort() {
        int[] array = {9, 4, 7, 0, 5, 2, 6};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j-1]>array[j]) {
                    int a = array[j];
                    array[j] = array[j-1];
                    array[j-1]=a;
                }
            }
        }
        for (int i : array) {
            System.out.print(i +" ");
        }
    }
}
