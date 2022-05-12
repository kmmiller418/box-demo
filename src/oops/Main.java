package oops;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20);
        Box b2 = new Box(10, 10);
        Box b3 = new Box(b1);

        Box b4 = b2.duplicate();

        System.out.println(b1);
        System.out.println(b3);

        if (b1.isEqual(b3)){
            System.out.println("B1 and b3 are equal");
        }

        if (Box.areTwoBoxesEqual(b2, b4)){
            System.out.println("B2 and b4 are equal");
        }

        System.out.println(b2);
        System.out.println(b4);
    }
}
