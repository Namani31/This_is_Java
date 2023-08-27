package Chapter08;

public class Bus implements Vehicle {

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    // 강제 타입 변환해야만 사용 가능
    public void checkFare() {
        System.out.println("승차 요금을 확인합니다.");
    }
}
