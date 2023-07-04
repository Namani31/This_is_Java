package Chapter04;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
                    for (char lower = 'a'; lower <= 'z'; lower++) {
                        System.out.println(upper + "-" + lower);

                        // lower 변수가 g를 갖게 되면 바깥쪽 반복문까지 종료
                        if (lower == 'g') {
                            break Outter;
                        }
                    }
        }
        System.out.println("프로그램 실행 종료");
    }
}
