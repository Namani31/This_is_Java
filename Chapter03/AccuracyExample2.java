package Chapter03;

public class AccuracyExample2 {
    public static void main(String[] args) {
        int apple = 1;

        int totalPieces = apple * 10;
        int number = 7;
        int temp = totalPieces - number; // 정수 연산 변경

        double result = temp / 10.0;

        System.out.println("사과 한 개에서 ");
        System.out.println("0.7 조각을 빼면, ");
        System.out.println(result + "조각이 남는다. ");
    }
}
