

public class Car {
    private final String name;
    private final Integer MAX_LENGTH = 5;

    public Car (String carName) throws Exception{
        this.name = carName;
        validateName();
    }

    private void validateName() throws Exception {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.");
        }
    }

}
