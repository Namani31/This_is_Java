package Chapter04;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) throws IOException {
        boolean run = true;
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");

            int keyCode = scanner.nextInt();

            if (keyCode == 1) {
                System.out.print("예금액> ");
                balance += scanner.nextInt();
                System.out.println();
            } else if (keyCode == 2) { // 2를 읽었을 경우
                System.out.print("출금액> ");
                balance -= scanner.nextInt();
                System.out.println();
            } else if (keyCode == 3) {    // 3을 읽었을 경우
                System.out.print("잔고> " + balance);
                System.out.println();
            } else if (keyCode == 4) {    // 4를 읽었을 경우
                run = false;
            }

        }
        System.out.println("프로그램 종료");
    }
}
