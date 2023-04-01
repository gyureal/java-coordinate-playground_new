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

        Coordinates coordinates = new Coordinates(1, 1, 2, 2);
        double distance = coordinates.calculateDistance();

        assertThat(distance).isEqualTo(1.414, offset(0.00099));

    }

    @Test
    void 좌표_거리_계산_2() {

        Coordinates coordinates = new Coordinates(1, 5, 3, 1);
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

    @Test
    void toString_Test() {
        Coordinates coordinates = new Coordinates(1, 5, 3, 1);
        String result = coordinates.toString();

        assertThat(result).isEqualTo("(1, 5) (3, 1)");
    }

}