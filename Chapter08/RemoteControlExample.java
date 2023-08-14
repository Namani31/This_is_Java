package Chapter08;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 객체 타입 변수 rc
        RemoteControl rc;

        // 인터페이스로 구현 객체 사용하기 위해 구현 객체 대입
        rc = new Television();
        rc = new Audio();
    }
}
