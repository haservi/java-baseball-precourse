package baseball.controller;

import static baseball.common.ConstValue.GAME_START;

public class GameController {

    public GameController() {
    }

    public void playing() {
        int gameStatus = 1;
        while (GAME_START == gameStatus) {
            System.out.println("game start");
            start();
            // TODO: 사용자가 종료 여부 판단
            gameStatus = 2;
        }
        System.out.println("game end");

    }

    private void start() {
        // TODO: 컴퓨터 랜덤 숫자 지정(유효성검사)
        // TODO: 반복하여 정답 확인
        // TODO: 사용자 입력 관련 값 지정(유효성검사)
    }
}
