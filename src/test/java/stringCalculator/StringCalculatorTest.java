package stringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void splitTest_컴마() {
        StringCalculator sc = new StringCalculator("1,2,3,4");
        String[] result = sc.split();

        String[] answer = {"1","2","3","4"};
        assertThat(result).isEqualTo(answer);
    }

    @Test
    void splitTest_콜론() {
        StringCalculator sc = new StringCalculator("1:2:3:4");
        String[] result = sc.split();

        String[] answer = {"1","2","3","4"};
        assertThat(result).isEqualTo(answer);
    }

    @Test
    void splitTest_컴마와콜론() {
        StringCalculator sc = new StringCalculator("1:2,3:4");
        String[] result = sc.split();

        String[] answer = {"1","2","3","4"};
        assertThat(result).isEqualTo(answer);
    }

    @Test
    void sumTest_10() {
        StringCalculator sc = new StringCalculator("1:2,3:4");
        Integer sum = sc.sum();
        assertThat(sum).isEqualTo(10);
    }

}
