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

        Computer computer = new Computer();
        boolean isClear = false;

        while (!isClear) {
            System.out.print(ConstMessage.INPUT_NUMBER);
            User user = new User(Console.readLine());
            String result = user.score(computer.ballList);
            System.out.println(result);
            isClear = user.userResult.isClear();
        }
    }
}
