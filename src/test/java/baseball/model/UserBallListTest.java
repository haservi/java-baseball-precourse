package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserBallListTest {

    @Test
    @DisplayName("01_사용자 입력 값 유효성 확인")
    void user_ball_input() {
        assertThatThrownBy(() -> new UserBallList("023")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new UserBallList("103")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new UserBallList("a03")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new UserBallList("1233")).isInstanceOf(IllegalArgumentException.class);
    }



}