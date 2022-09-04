package homework.module_8;

import homework.module_8.shape_interfaces.Displayable;

public final class Displayer {

    private Displayer(){
    }

    public static void display(Object o) {
        if (o instanceof Displayable) {
            ((Displayable) o).display();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
