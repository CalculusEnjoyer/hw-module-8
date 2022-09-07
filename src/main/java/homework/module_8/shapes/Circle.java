package homework.module_8.shapes;

public class Circle extends Shape {
    private double radius;
    private static final String CIRCLE_NAME = "Circle";

    public Circle(){
        this(0);
    }

    public Circle(double radius){
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("radius can not be negative");
        }
    }

    public static String getCircleName() {
        return CIRCLE_NAME;
    }

    @Override
    public String determineShapeType() {
        return getCircleName();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("radius can not be negative");
        }
    }
}
