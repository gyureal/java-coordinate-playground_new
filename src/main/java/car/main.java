package car;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();
        System.out.println("시도할 횟수는 몇회인가요?");
        String number = scanner.nextLine();

        int carNum = names.split(",").length;
        int roundLength = Integer.parseInt(number);

        // 랜덤 로직
        List<List<Integer>> random = RandomGenerator.generate(carNum, roundLength);

        // Game
        Game game = new Game(names);
        game.setRoundLength(number);
        game.play(random);
    }
}
