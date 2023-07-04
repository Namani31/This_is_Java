package Chapter04;

public class Exercise06 {
    public static void main(String[] args) {
        for (int line = 0; line < 5; line++) {
            /*
                line이 0일 때 star가 1개 (1행일 때 1개)
                line이 1일 때 star가 2개 (2행일 때 2개)
                line이 2일 때 star가 3개 (3행일 때 3개)
                이런 식이기 때문에 조건식이 line + 1이 되는 것
             */
            for (int star = 0; star < line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
