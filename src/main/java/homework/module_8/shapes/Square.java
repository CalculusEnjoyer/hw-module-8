package homework.module_8.shapes;

public class Square implements Shape{
    private double sideLength;
    public static final String SQUARE_NAME = "Square";

    @Override
    public void display() {
        System.out.println("This is "+SQUARE_NAME);
    }
}
