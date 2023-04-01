package coordinate;

import lombok.Getter;

@Getter
public class Coordinate {
    private int x;
    private int y;

    private static final int MAX_VALUE = 24;

    private Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinate from(String x, String y) { // 정적 팩토리 메서드
        int parsedX = Integer.parseInt(x);
        int parsedY = Integer.parseInt(y);

        validateInputRange(parsedX, parsedY);
        return new Coordinate(parsedX, parsedY);
    }

    public static Coordinate from(int x, int y) { // 정적 팩토리 메서드

        validateInputRange(x, y);
        return new Coordinate(x, y);
    }

    private static void validateInputRange(int x, int y) {
        if (x < 0 || x > MAX_VALUE || y < 0 || y > MAX_VALUE) {
            throw new IllegalArgumentException("좌표의 범위는 0 ~ " + MAX_VALUE + "입니다.");
        }
    }

}
