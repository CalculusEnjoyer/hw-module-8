package homework.module_8.shapes;

public class Hexagon extends Shape {
    private static final String HEXAGON_NAME = "Hexagon";

    public static String getHexagonName() {
        return HEXAGON_NAME;
    }

    @Override
    public String determineShapeType() {
        return getHexagonName();
    }
}
