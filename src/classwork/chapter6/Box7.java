package classwork.chapter6;

/* Here, Box uses a constructor to initialize the dimensions of box.
 */
class Box7 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        // declare, allocate, and initialize Box objects.
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);

    }
}









