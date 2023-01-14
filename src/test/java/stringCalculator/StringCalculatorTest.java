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
        StringCalculator sc = new StringCalculator("a,s,d,f");
        List<String> result = sc.split();

        List<String> answer = new ArrayList<>();
        answer.add("a");
        answer.add("s");
        answer.add("d");
        answer.add("f");
        assertThat(result).isEqualTo(answer);
    }

    @Test
    void splitTest_세미콜론() {
        StringCalculator sc = new StringCalculator("a;s;d;f");
        List<String> result = sc.split();

        List<String> answer = new ArrayList<>();
        answer.add("a");
        answer.add("s");
        answer.add("d");
        answer.add("f");
        assertThat(result).isEqualTo(answer);
    }

    @Test
    void splitTest_컴마와세미콜론() {
        StringCalculator sc = new StringCalculator("a;s,d;f");
        List<String> result = sc.split();

        List<String> answer = new ArrayList<>();
        answer.add("a");
        answer.add("s");
        answer.add("d");
        answer.add("f");
        assertThat(result).isEqualTo(answer);
    }

}
