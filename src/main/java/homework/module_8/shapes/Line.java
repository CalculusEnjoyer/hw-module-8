package homework.module_8.shapes;

public class Line extends Shape {
    private double length;
    public static final String LINE_NAME = "Line";

    public Line() {
    }

    public Line(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("length must be positive");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("length must be positive");
        }
    }

    @Override
    public void display() {
        System.out.println("This is " + LINE_NAME);
    }
}
