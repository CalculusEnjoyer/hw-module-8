package homework.module_8;

import homework.module_8.shapes.Circle;
import homework.module_8.shapes.Hexagon;
import homework.module_8.shapes.Shape;
import homework.module_8.shapes.Square;
import static homework.module_8.utilities.Displayer.display;

public class Main {
    public static void main(String[] args) {
        Shape testShape = new Circle();
        display(testShape);

        testShape = new Hexagon();
        display(testShape);

        testShape = new Square();
        display(testShape);
    }
}
