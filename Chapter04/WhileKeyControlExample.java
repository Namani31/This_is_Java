package Chapter04;

import java.io.IOException;

public class WhileKeyControlExample {
    public static void main(String[] args) throws IOException {
        boolean run = true;
        int speed = 0;
        int keyCode = 0;

        while (run) {
            /*
                Enter 키 입력 시 캐리지 리턴 (13), 라인 피드 (10)이
                입력되므로 이 값을 제외시켜 둠
             */
            if (keyCode != 13 && keyCode != 10) {
                System.out.println("---------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("---------------");
                System.out.print("선택: ");
            }

            // 키보드의 키 코드 읽기
            keyCode = System.in.read();

            if (keyCode == 49) {    // 1을 읽었을 경우
                speed++;
                System.out.println("현재 속도= " + speed);
            } else if (keyCode == 50) {     // 2를 읽었을 경우
                speed--;
                System.out.println("현재 속도= " + speed);
            } else if (keyCode == 51) {     // 3을 읽었을 경우
                // while문 종료 위해 run 변수에 false 저장
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
