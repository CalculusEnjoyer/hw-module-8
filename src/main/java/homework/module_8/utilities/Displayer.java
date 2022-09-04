package homework.module_8.utilities;

import homework.module_8.interfaces.Displayable;

public final class Displayer {
    private Displayer() {
    }

    public static void display(Displayable displayable) {
        displayable.display();
    }
}
