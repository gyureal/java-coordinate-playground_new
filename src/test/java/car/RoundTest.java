package car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RoundTest {

    @Test
    void play_3개의_car_1_1_0_전진() throws Exception{
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pori", 0));
        cars.add(new Car("pori", 0));
        cars.add(new Car("pori", 0));

        List<Integer> probabilities = new ArrayList<>();
        probabilities.add(5);
        probabilities.add(5);
        probabilities.add(4);

        Round round = new Round(1, cars);
        List<String> playResult = round.play(probabilities);

        List<String> answer = new ArrayList<>();
        answer.add("-");
        answer.add("-");
        answer.add("");

        assertThat(playResult).isEqualTo(answer);
    }

}
