package homework.module_8.shapes;

public class Octagon extends Shape {
    private static final String OCTAGON_NAME = "Octagon";

    public static String getOctagonName() {
        return OCTAGON_NAME;
    }

    @Override
    public String determineShapeType() {
        return getOctagonName();
    }
}
