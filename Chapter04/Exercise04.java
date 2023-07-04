package Chapter04;

public class Exercise04 {
    public static void main(String[] args) {
        int sum = 0;

        // 눈의 합이 5이면 실행 중단
        while (sum != 5) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            sum = num1 + num2;

            System.out.println("(" + num1 + ", " + num2 + ")");
        }
    }
}