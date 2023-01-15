package car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    private static Random random = new Random();

    public static List<List<Integer>> generate(Integer carNum,Integer round) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < round; i++) {
            List<Integer> probabilities = new ArrayList<>();
            result.add(generateOneRound(carNum));
        }
        return result;
    }

    private static List<Integer> generateOneRound(Integer carNum) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < carNum; i++) {
            result.add(random.nextInt(10));
        }
        return result;
    }
}
