package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BallList {

    public List<Ball> ballList;

    public BallList() {
        this.ballList = new ArrayList<>();
    }

    public void addBall(List<Integer> ballList) {
        for (Integer number : ballList) {
            this.ballList.add(new Ball(number));
        }
    }

}
