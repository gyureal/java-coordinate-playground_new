package coordinate;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    private final List<Coordinate> coordinates;

    public Coordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates() {this.coordinates = new ArrayList<>(); }

    public void addCoordinate(Coordinate coordinate) {
        coordinates.add(coordinate);
    }

    public double calculateDistance() {
        if (coordinates.size() != 2) {
            throw new IllegalStateException("거리를 구하려면 좌표가 두개 여야 합니다.");
        }
        Coordinate one = coordinates.get(0);
        Coordinate theOther = coordinates.get(1);

        double xDistance = Math.abs(one.getX() - theOther.getX());
        double yDistance = Math.abs(one.getY() - theOther.getY());

        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
}
