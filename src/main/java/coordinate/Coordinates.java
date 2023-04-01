package coordinate;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    private final List<Coordinate> coordinates;

    public Coordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates() {this.coordinates = new ArrayList<>(); }

    public Coordinates(int x1, int y1, int x2, int y2) {
        Coordinate one = Coordinate.of(x1, y1);
        Coordinate theOther = Coordinate.of(x2, y2);

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(one);
        coordinateList.add(theOther);

        coordinates = coordinateList;
    }

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

    @Override
    public String toString() {
        String result = "";
        for (Coordinate coordinate : coordinates){
            result += coordinate;
            result += " ";
        }
        result = result.trim();     // trim() 사용시 재할당 해줘야함

        return result ;
    }
}
