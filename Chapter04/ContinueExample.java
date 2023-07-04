package Chapter04;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // 홀수면 출력 안 함
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
