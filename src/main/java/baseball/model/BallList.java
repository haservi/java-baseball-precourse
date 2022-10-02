package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BallList {

    public List<Ball> ballList;

    public BallList() {
        this.ballList = new ArrayList<>();
    }

    public void addBall(Set<Integer> ballSet) {
        for (Integer number : ballSet) {
            ballList.add(new Ball(number));
        }
    }
}
