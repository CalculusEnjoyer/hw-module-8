package homework.module_8.utility;

import homework.module_8.shapes.Shape;

public final class Displayer {
    private Displayer() {
    }

    public static void display(Shape shape) {
        shape.display();
    }
}
