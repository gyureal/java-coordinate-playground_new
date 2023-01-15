package car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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


}
