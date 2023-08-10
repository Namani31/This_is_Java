package Chapter07;

public interface RemoteControl {
    // 상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 추상 메소드, 실행부 없음
    public void turnOn();
    public void turnOFF();
    public void setVolume(int volume);
}
