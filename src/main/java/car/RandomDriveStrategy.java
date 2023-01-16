package car;

import java.util.Random;

public class RandomDriveStrategy implements DriveStrategy {

    private static final Integer DRIVE_MIN_NUMBER = 4;
    private static final Random random = new Random();
    @Override
    public Boolean movable() {
        return makeRandomNumber() > DRIVE_MIN_NUMBER;
    }

    private Integer makeRandomNumber() {
        return random.nextInt(10);
    }
}
