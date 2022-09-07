package homework.module_8.shapes;

public class Square extends Shape {
    private double sideLength;
    private static final String SQUARE_NAME = "Square";

    public static String getSquareName() {
        return SQUARE_NAME;
    }

    @Override
    public String determineShapeType() {
        return getSquareName();
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
}
