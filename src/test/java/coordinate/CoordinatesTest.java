package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void 좌표_거리_계산() {
        Coordinate one = Coordinate.of(1, 1);
        Coordinate theOther = Coordinate.of(2, 2);

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(one);
        coordinateList.add(theOther);

        Coordinates coordinates = new Coordinates(coordinateList);
        double distance = coordinates.calculateDistance();

        assertThat(distance).isEqualTo(1.414, offset(0.00099));

    }

    @Test
    void 좌표_거리_계산_2() {
        Coordinate one = Coordinate.of(1, 5);
        Coordinate theOther = Coordinate.of(3, 1);

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(one);
        coordinateList.add(theOther);

        Coordinates coordinates = new Coordinates(coordinateList);
        double distance = coordinates.calculateDistance();

        assertThat(distance).isEqualTo(4.472, offset(0.00099));
    }

    @Test
    void 좌표_거리_계산_Exception() {
        Coordinate one = Coordinate.of(3, 1);

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(one);

        Coordinates coordinates = new Coordinates(coordinateList);
        assertThrows(IllegalStateException.class, () -> {
            coordinates.calculateDistance();
        });
    }

}