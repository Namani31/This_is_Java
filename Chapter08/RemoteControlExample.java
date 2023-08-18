package Chapter08;

import Chapter06.Television;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOFF();

        rc = new Audio();
        rc.turnOn();
        rc.turnOFF();
    }
}
