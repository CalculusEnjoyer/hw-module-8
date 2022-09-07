package homework.module_8.shapes.utility;

import homework.module_8.shapes.Shape;

public final class Displayer {
    private Displayer() {
    }

    public static void display(Shape shape) {
        System.out.println("This is " + shape.determineShapeType());
    }
}
