package car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void 입력값_체크_후_split() {
        String inputStr = "pobi,crong,honux";

        Game game = new Game(inputStr);
        String[] inputStrArr = game.getInputStrArr();

        String[] answer = {"pobi", "crong", "honux"};
        assertThat(inputStrArr).isEqualTo(answer);
    }

    @Test
    void game_play_test() throws Exception{
        String inputStr = "pobi,crong,honux";
        String roundLength = "2";
        Game game = new Game(inputStr);
        game.setRoundLength(roundLength);

        List<List<Integer>> roundProbabilities = new ArrayList<>();
        List<Integer> probabilities1 = Arrays.asList(5,5,4); // - -
        List<Integer> probabilities2 = Arrays.asList(3, 7, 9); // - -- -
        roundProbabilities.add(probabilities1);
        roundProbabilities.add(probabilities2);

        game.play(roundProbabilities); // - -- -
    }


}
