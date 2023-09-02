package Homework;

public class FigurePainter {
    public static void main(String[] args) {
        // Triangle 1.
        for (int i = 0 ; i < 5 ; i++) {
            for ( int j = i + 1; j >= 1 ;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Triangle 2.
        for ( int i = 5; i > 0 ; i-- ) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        // Triangle 3.
        for ( int i = 4 ; i >= 0; i --) {
            for (int j = i ; j > 0 ; j--) {
                System.out.print("  ");
            }
            for (int j = 5 - i ; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        // Triangle 4.
        for (int i = 0; i <= 4 ; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Triangle 5.
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i ; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4 ; i++) {
            for (int j = i ; j >= 1 ; j--) {
                System.out.print(" ");
            }
            for (int j= 5-i ;j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
