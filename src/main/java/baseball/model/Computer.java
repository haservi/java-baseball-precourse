package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static baseball.common.ConstValue.*;

public class Computer extends BallList {

    public Computer() {
        addBall(createRandomBall());
    }

    private List<Integer> createRandomBall() {
        Set<Integer> randomBall = new LinkedHashSet<>();
        while (randomBall.size() < TOTAL_ROUND) {
            randomBall.add(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
        }
        return new ArrayList<>(randomBall);
    }

}
