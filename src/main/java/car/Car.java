package car;

import lombok.Getter;

@Getter
public class Car {
    private final String name;
    private final Integer MAX_LENGTH = 5;
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

    public void drive(Integer probability) {
        if (probability > 4) {
            distance += 1;
        }
    }

}
