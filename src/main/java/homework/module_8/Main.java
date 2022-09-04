package homework.module_8;

import homework.module_8.shapes.Circle;
import homework.module_8.shapes.Hexagon;
import homework.module_8.shapes.Shape;
import homework.module_8.shapes.Square;
import homework.module_8.utility.Displayer;

public class Main {
    public static void main(String[] args) {
        Shape testShape = new Circle();
        Displayer.display(testShape);

        testShape = new Hexagon();
        Displayer.display(testShape);

        testShape = new Square();
        Displayer.display(testShape);
    }
}
