package Chapter08;

public class VehicleExample {
    public static void main(String[] args) {
        // 인터페이스 변수 = 구현 객체
        Vehicle vehicle = new Bus();

        vehicle.run();
        /* vehicle.checkFare(); (x)
            Vehicle 인터페이스에는 checkFare()가 없음
         */

        // 강제 타입 변환
        Bus bus = (Bus) vehicle;

        // Bus 클래스에는 checkFare()가 있음
        bus.run();
        bus.checkFare();
    }
}
