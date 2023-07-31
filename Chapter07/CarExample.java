package Chapter07;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);

                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);

                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.frontRightTire = new KumhoTire("뒤왼쪽", 14);

                case 4:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    car.frontRightTire = new KumhoTire("뒤오른쪽", 17);
                    break;
            }
            System.out.printf("------------------------"); // 1회전 시 출력되는 내용을 구분
        }
    }
}
