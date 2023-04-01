package coordinate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

    }

    public static Coordinate parseInput(String input) {

        try {
            String content = input.substring(1, input.length() - 1);
            String[] cord = content.split(", ");
            return Coordinate.from(cord[0], cord[1]);

        } catch (Exception e) {
            throw new IllegalArgumentException("올바른 값을 입력해 주세요 : ex) (1, 2)");
        }
    }
}
