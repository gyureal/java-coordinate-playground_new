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

    public void rendering() {
        String result = "";
        result += makeGrid();
        result += "\n";
        result += printDistance();
        System.out.println(result);
    }

    private String printDistance() {
        double distance = 3d;
        return String.format("두 점 사이의 거리는 %f", distance);
    }

    public String makeGrid() {
        String entireLine = "";

        return entireLine;
    }


}
