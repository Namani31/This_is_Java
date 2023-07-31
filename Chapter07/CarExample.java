package Chapter07;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();    // 1~4 의 값 가짐

            if (problemLocation != 0) {
                // 펑크 난 타이어의 위치 읽음, 1을 빼는 이유는 1~4까지의 값을 가지는데 인덱스는 0부터 시작하기 때문
                System.out.println(car.tires[problemLocation - 1].location + " HankookTire로 교체");
                // Car의 tires의 배열 항목으로 새로운 HankookTire를 대입
                car.tires[problemLocation - 1] =
                        new HankookTire(car.tires[problemLocation - 1].location, 15);
            }
            System.out.println("------------------------"); // 1회전 시 출력되는 내용을 구분
        }
    }
}
