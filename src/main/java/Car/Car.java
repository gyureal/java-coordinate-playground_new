package Car;

public class Car {
    private static Integer NAME_MAX = 5;
    private static Integer NAME_MIN = 1;
    private static Integer MIN_MOVABLE_NUM = 4;

    private String name;
    private Integer distance;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
        validateName();
    }

    public Car(String name, Integer distance) {
        this(name);
        this.distance = distance;
    }

    private void validateName() {
        if (NAME_MIN > name.length() || NAME_MAX < name.length()) {
            throw new IllegalArgumentException("이름의 길이는 1이상 5이하여야합니다.");
        }
    }

    protected Boolean movable() {
        if (generateRandomNumber() >= MIN_MOVABLE_NUM){
            return true;
        }
        return false;
    }

    private Boolean movable(int number) {
        if (number >= MIN_MOVABLE_NUM){
            return true;
        }
        return false;
    }

    public void move() {
        if (movable()) {
            this.distance += 1;
        }
    }

    public void move(int number) {
        if (movable()) {
            this.distance += 1;
        }
    }

    private Integer generateRandomNumber() {
        double num = Math.random();
        return (int)(num * 10);
    }

    public String name() {
        return this.name;
    }
    public Integer distance() {
        return this.distance;
    }
}
