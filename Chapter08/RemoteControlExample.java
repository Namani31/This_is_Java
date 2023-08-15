package Chapter08;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 익명 구현 객체 타입 변수인 rc
        // new RemoteControl()이 인터페이스 자체를 생성자처럼 사용
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOFF() {

            }

            @Override
            public void setVolume(int volume) {

            }
        };
    }
}
