package coordinate;

public class CoordinateSystem {

    private static final int GRID_LIMIT = 24;

    private final Coordinates coordinates;

    public CoordinateSystem() {
        this.coordinates = new Coordinates();
    }

    public void addCoordinate(Coordinate coordinate) {
        coordinates.addCoordinate(coordinate);
    }

    public String printCoordinates() {
        return coordinates.toString();
    }

    public String rendering() {return "";}

    public String renderDistance() throws IllegalStateException{

        try {
            double distance = coordinates.calculateDistance();
            return String.format("두 점 사이의 거리는 %.3f입니다.", distance);
        } catch (IllegalStateException exception) { // 거리 측정 에러시, 거리 표시를 하지 않는다.
            return "";
        }
    }

    public String makeGrid() {
        String entireLine = "";

        return entireLine;
    }


}
