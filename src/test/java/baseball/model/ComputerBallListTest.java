package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComputerBallListTest {

    @Test
    @DisplayName("01_컴퓨터 랜덤 볼")
    void random_ball_check() {
        BallList computerBallList = new ComputerBallList();
        assertThat(computerBallList.ballList.size()).isEqualTo(3);
    }

}