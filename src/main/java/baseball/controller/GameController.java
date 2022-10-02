package baseball.controller;

import baseball.common.ConstMessage;
import baseball.model.BallList;
import baseball.model.Computer;
import baseball.model.User;
import camp.nextstep.edu.missionutils.Console;

import static baseball.common.ConstValue.GAME_START;

public class GameController {

    public GameController() {
    }

    public void playing() {
        int gameStatus = 1;
        while (GAME_START == gameStatus) {
            start();
            // TODO: 사용자가 종료 여부 판단
            gameStatus = 2;
        }
        System.out.println("game end");

    }

    private void start() {

        BallList computerBallList = new Computer();
        boolean isClear = false;

        while (!isClear) {
            System.out.print(ConstMessage.INPUT_NUMBER);
            BallList userBallList = new User(Console.readLine());
            // TODO: 컴퓨터와 사용자 정답 비교

        }
    }
}
