package Chapter08;

public interface RemoteControl {
    // 상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();
    void turnOFF();
    void setVolume(int volume);

    // 디폴트 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    // 정적 메소드, 객체가 없어도 인터페이스만으로도 호출 가능
    static void ChangeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
