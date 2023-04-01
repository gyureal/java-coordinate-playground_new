package coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @Test
    void 입력값_파싱_invalid() {
        String input = "311141";

        assertThrows(IllegalArgumentException.class, () -> {
            Main.parseInput(input);
        });
    }

    @Test
    void 입력값_파싱_valid() {
        String input = "(12, 3)";

        Coordinate coordinate = Main.parseInput(input);

        assertThat(coordinate.getX()).isEqualTo(12);
        assertThat(coordinate.getY()).isEqualTo(3);
    }

}