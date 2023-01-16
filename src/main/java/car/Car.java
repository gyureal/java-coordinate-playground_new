package car;

import lombok.Getter;

import java.util.Random;

@Getter
public class Car {
    private final String name;
    private static final Integer MAX_LENGTH = 5;
    private static final Integer DRIVE_MIN_NUMBER = 4;
    private static final Random random = new Random();
    public Integer distance = 0;


    public Car (String carName, Integer distance) throws Exception{
        this.name = carName;
        this.distance = distance;
        validateName();
    }

    private void validateName() throws Exception {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.");
        }
    }

    public void drive() {
        Integer randomNumber = random.nextInt(10);
        if (makeRandomNumber() > DRIVE_MIN_NUMBER) {
            distance += 1;
        }
    }

    protected Integer makeRandomNumber() {
        return random.nextInt(10);
    }

    public void drive(Integer probability) {
        if (probability > DRIVE_MIN_NUMBER) {
            distance += 1;
        }
    }

    public void drive(DriveStrategy driveStrategy) {
        if (driveStrategy.movable()) {
            distance += 1;
        }
    }

}
