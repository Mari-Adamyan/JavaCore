package classwork.chapter5;

// A simple example of switch.
public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 2:
                    System.out.println("i is one.");
                    break;
                case 3:
                    System.out.println("i is two.");
                    break;
                case 4:
                    System.out.println("i is three.");
                    break;
                default:
                    System.out.println("i is grater than 3.");
            }
    }
}
