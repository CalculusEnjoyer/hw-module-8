package homework.module_8.shapes;

public class Square extends Shape {
    private double sideLength;
    public static final String SQUARE_NAME = "Square";

    public Square() {
    }

    public Square(double sideLength) {
        if (sideLength >= 0) {
            this.sideLength = sideLength;
        } else {
            throw new IllegalArgumentException("side length can not be negative");
        }
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if (sideLength >= 0) {
            this.sideLength = sideLength;
        } else {
            throw new IllegalArgumentException("side length can not be negative");
        }
    }

    @Override
    public void display() {
        System.out.println("This is " + SQUARE_NAME);
    }
}
