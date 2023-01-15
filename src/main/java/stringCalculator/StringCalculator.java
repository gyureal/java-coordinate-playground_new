package stringCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {
    private String inputString;

    public StringCalculator(String inputString) {
        this.inputString = inputString;
    }

    public Boolean isNull(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }
        return false;
    }

    // //;\n1;2;3
    public String[] split(){
        // custom
        Pattern pattern = Pattern.compile("//(.)\n(.*)");
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            String customSpliter = matcher.group(1);
            return matcher.group(2).split(customSpliter);
        }
        return inputString.split(",|:");
    }

    public Integer sum() {
        String[] split = split();
        return Arrays.asList(split).stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
// asList로 생성한 arrayList remove가 안되는 이유와 해결책
// java.lang.UnsupportedOperationException: remove
// https://kkwonsy.tistory.com/14

// stream 값 sum 하기
// https://kapentaz.github.io/java/Java8-stream-sum-%EA%B5%AC%ED%95%98%EA%B8%B0/#
