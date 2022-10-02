package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import static baseball.common.ConstValue.*;

public class ComputerBallList extends BallList {

    public ComputerBallList() {
        createRandomBall();
    }

    private void createRandomBall() {
        Set<Integer> randomBall = new LinkedHashSet<>();
        while (randomBall.size() < TOTAL_ROUND) {
            randomBall.add(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
        }
        addBall(new ArrayList<>(randomBall));
    }
}
