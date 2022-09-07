package homework.module_8.shapes;

public class Line extends Shape {
    private double length;
    private static final String LINE_NAME = "Line";

    public Line(){
        this(0);
    }

    public Line(double length){
        if (length >= 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("length must be positive");
        }
    }

    public static String getLineName() {
        return LINE_NAME;
    }

    @Override
    public String determineShapeType() {
        return getLineName();
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
}
