package homework.module_8.shapes;

public class Circle extends Shape {
    private double radius;
    public static final String CIRCLE_NAME = "Circle";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
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

    @Override
    public void display() {
        System.out.println("This is " + CIRCLE_NAME);
    }
}
