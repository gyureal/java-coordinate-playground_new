package car;

import lombok.Getter;

@Getter
public class Game {

    private final String inputStr;
    private final String[] inputStrArr;
    public Game(String inputStr) {
        this.inputStr = inputStr;
        inputStrArr = convertToArray();
    }

    private String[] convertToArray() {
        return inputStr.split(",");
    }
}
