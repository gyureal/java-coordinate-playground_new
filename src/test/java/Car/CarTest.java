package Car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void 자동차_생성_성공_테스트 () throws Exception {
        // given
        String carName = "김무무";

        // when
        Car car  = new Car(carName);

        // then
        Integer initDistance = 0;

        assertThat(car.name()).isEqualTo(carName);
        assertThat(car.distance()).isEqualTo(initDistance);
    }

    @Test
    public void 자동차_생성_에러_테스트 () throws Exception {
        // given
        String carName = "김무무아닙니다";

        // then
        assertThatThrownBy(() -> {
            // when
            Car car  = new Car(carName);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름의 길이는 1이상 5이하여야합니다.");
    }
    
    @Test
    public void 이동_메서드_테스트 () throws Exception {
        // given
        String name = "김무무";
        Integer distance = 2;
        Car car = new Car(name, distance) {
            @Override
            protected Boolean movable() {
                return true;
            }
        };

        // when
        car.move();
        
        // then
        assertThat(car.distance()).isEqualTo(distance + 1);
    }
}
