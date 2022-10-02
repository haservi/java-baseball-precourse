package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    @DisplayName("01_야구볼 생성 예외")
    void ball_create_exception() {
        assertThatThrownBy(() -> new Ball(0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Ball(10)).isInstanceOf(IllegalArgumentException.class);
    }

}