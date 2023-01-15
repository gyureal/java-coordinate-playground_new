package car;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Round {
    private final Integer roundNumber;
    private final List<Car> cars;

    public List<String> play(List<Integer> probabilities) {
        for (int i = 0; i < cars.size(); i++) {
             cars.get(i).drive(probabilities.get(i));
        }
        return returnResult();
    }

    private List<String> returnResult() {
        List<String> returnStr = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            returnStr.add(makeStr(i));
        }
        return returnStr;
    }

    private String makeStr(Integer idx) {
        Integer distance = cars.get(idx).distance;
        String name = cars.get(idx).getName();
        String str = name + " : ";
        for (int i = 0; i < distance; i++) {
             str += "-";
        }
        return str;
    }
}
