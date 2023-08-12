package Chapter07;

public interface RemoteControl {
    // 상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 디폴트 메소드, public 생략
     void turnOn();
     void turnOFF();
     void setVolume(int volume);
}
