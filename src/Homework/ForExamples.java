package Homework;

public class ForExamples {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + 1 + " ");
            if (i < 999) {
                System.out.print("- ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < 100; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print((i + 1) + "  ");
            }
        }

        System.out.println();
        System.out.println();

        int[] array = {2,5,8,4,9,3,7};
        int max = array[0];
        for (int i = 0; i < 7 ; i++) {
            if ( array[i] > max ) {
                max = array [i];
            }
        }
        System.out.println(max);
    }
}