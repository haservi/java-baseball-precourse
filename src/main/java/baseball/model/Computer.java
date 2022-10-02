package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

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
        System.out.println(Arrays.toString(randomBall.toArray()));
        return new ArrayList<>(randomBall);
    }

}
