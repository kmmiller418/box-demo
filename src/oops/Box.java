package oops;

public class Box {
    private int width;
    private int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
    }

    public boolean isEqual(Box b){
        if (this.width == b.width && this.height == b.height) {
            return true;
        } else {
            return false;
        }
    }

    public Box duplicate() {
        Box temp = new Box(this.width, this.height);
        return temp;
    }

    public static boolean areTwoBoxesEqual(Box b1, Box b2) {
        if (b1.width == b2.width && b1.height == b2.height) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Width is " + width + " and height is " + height;
    }
}
