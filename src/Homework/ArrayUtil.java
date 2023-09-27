package Homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        //assignment 1.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

        //assignment 2.
        System.out.println(numbers[0]);

        System.out.println();
        System.out.println();

        //assignment 3.
        System.out.println(numbers[numbers.length - 1]);

        System.out.println();
        System.out.println();

        //assignment 4.
        System.out.println(numbers.length);

        System.out.println();
        System.out.println();

        //assignment 5.
        int min = numbers[0];
        for (int i = 0; i < 9; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);

        System.out.println();
        System.out.println();

        //assignment 6.
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                System.out.println(numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2 - 1 + 1]);
            } else {
                System.out.println(numbers[numbers.length / 2 - 1 + 1]);
            }
            System.out.println("can't print middle values");
        }
        System.out.println();
        System.out.println();

        //assignment 7.
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println();
        System.out.println();

        //assignment 8.
        int _count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                _count++;
            }
        }
        System.out.println(_count);

        System.out.println();
        System.out.println();

        //assignment 9.
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        System.out.println();
        System.out.println();

        //assignment 10.
        int average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        average /= numbers.length;
        System.out.println(average);
    }
}





















