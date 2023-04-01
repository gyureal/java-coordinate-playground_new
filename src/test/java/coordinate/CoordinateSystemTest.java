package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CoordinateSystemTest {

    @Test
    void addCoordinateTest() {
        Coordinate coordinate = Coordinate.of(1, 3);

        CoordinateSystem coordinateSystem = new CoordinateSystem();
        coordinateSystem.addCoordinate(coordinate);

        String print = coordinateSystem.printCoordinates();
        assertThat(print).isEqualTo(coordinate.toString());
    }

    @Test
    void renderDistance_통과_Test() {
        Coordinate one = Coordinate.of(1, 1);
        Coordinate two = Coordinate.of(2, 2);

        CoordinateSystem coordinateSystem = new CoordinateSystem();
        coordinateSystem.addCoordinate(one);
        coordinateSystem.addCoordinate(two);

        String renderingResult = coordinateSystem.renderDistance();

        assertThat(renderingResult).isEqualTo("두 점 사이의 거리는 1.414입니다.");
    }

    @Test
    void renderDistance_에러_Test() {
        Coordinate one = Coordinate.of(1, 1);

        CoordinateSystem coordinateSystem = new CoordinateSystem();
        coordinateSystem.addCoordinate(one);

        String renderingResult = coordinateSystem.renderDistance();

        assertThat(renderingResult).isEqualTo("");
    }

}