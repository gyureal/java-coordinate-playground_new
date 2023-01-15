package car;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Game {

    private final String inputStr;
    private final String[] inputStrArr;
    private Integer roundLength;
    public Game(String inputStr) {
        this.inputStr = inputStr;
        this.inputStrArr = convertToArray();
    }

    public void setRoundLength(String number) {
        validateNumber(number);
        this.roundLength = Integer.parseInt(number);
    }

    private void validateNumber(String number) {
        boolean matches = number.matches("[0-9]+");
        if (!matches) {
            throw new IllegalArgumentException("입력값은 숫자여야 합니다.");
        }
    }

    private String[] convertToArray() {
        return inputStr.split(",");
    }

    public void play(List<List<Integer>> roundProbabilities) throws Exception{
        // Cars
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < inputStrArr.length; i++) {
            cars.add(new Car(inputStrArr[i], 0));
        }

        
        // Round
        System.out.println("실행결과");
        for (int i = 0; i <roundLength; i++) {
            Round round = new Round(i + 1, cars);
            round.play(roundProbabilities.get(i)).stream()
                    .forEach(x -> {
                        System.out.println(x);
                    });
            System.out.println();
        }

        // 판별
        String winner = judgeWinner(cars);
        winner = winner.substring(0, winner.length() - 1);
        System.out.println(winner + "가 최종 우승했습니다");
    }

    private String judgeWinner(List<Car> cars) {
        Integer max_d = 0;
        for (Car car : cars) {
            if (car.distance > max_d){
                max_d = car.distance;
            }
        }

        String winner = "";
        for (Car car : cars) {
            if (car.distance == max_d) {
                winner += car.getName();
                winner += ",";
            }
        }

        return winner;
    }
}
