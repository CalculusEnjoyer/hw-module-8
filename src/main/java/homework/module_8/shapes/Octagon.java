package homework.module_8.shapes;

public class Octagon implements Shape{
    public static final String OCTAGON_NAME = "Octagon";

    @Override
    public void display() {
        System.out.println("This is "+OCTAGON_NAME);
    }
}
