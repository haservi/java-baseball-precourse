package baseball.controller;

import baseball.common.ConstMessage;
import baseball.model.ComputerBallList;
import baseball.model.UserBallList;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;

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

        ComputerBallList computerBallList = new ComputerBallList();

        boolean isClear = false;
        while (!isClear) {
            System.out.print(ConstMessage.INPUT_NUMBER);
            UserBallList userBallList = new UserBallList(Console.readLine());
        }
    }
}
