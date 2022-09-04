package homework.module_8.shapes;

public class Hexagon extends Shape {
    public static final String HEXAGON_NAME = "Hexagon";

    public Hexagon() {
    }

    @Override
    public void display() {
        System.out.println("This is "+HEXAGON_NAME);
    }
}
