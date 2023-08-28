package Chapter08;

public class Driver {
    // vehicle 안에 Bus, Taxi 객체 들어가 있음
    public void drive(Vehicle vehicle) {
        // vehicle 매개 변수가 참조하는 객체가 Bus 인지 확인
        if (vehicle instanceof Bus) {
            // Bus 객체일 경우 안전하게 강제 타입 변환 시킴
            Bus bus = (Bus) vehicle;
            // 구현 객체의 메소드 사용 가능
            bus.checkFare();
        }
        // 추상 메소드
        vehicle.run();
    }
}
