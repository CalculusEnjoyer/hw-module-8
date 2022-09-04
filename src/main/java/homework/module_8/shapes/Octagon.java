package homework.module_8.shapes;

public class Octagon extends Shape {
    public static final String OCTAGON_NAME = "Octagon";

    public Octagon() {
    }

    @Override
    public void display() {
        System.out.println("This is " + OCTAGON_NAME);
    }
}
