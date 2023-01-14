package stringCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
    private final String inputString;
    private static final String[] default_separator = {",", ":"};

    public StringCalculator(String inputString) {
        this.inputString = inputString;
    }

    public List<Integer> split(){
        String[] splitArray = inputString.split("");
        List<String> splitList = Arrays.asList(splitArray);
        return splitList.stream()
                .filter(s -> !s.equals(","))
                .filter(s -> !s.equals(";"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public Integer sum() {
        List<Integer> split = split();
        return split.stream().reduce(0, Integer::sum);
    }

}
// asList로 생성한 arrayList remove가 안되는 이유와 해결책
// java.lang.UnsupportedOperationException: remove
//https://kkwonsy.tistory.com/14
