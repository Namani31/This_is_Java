package Chapter07;

public class Tire {
    // 필드
    public int maxRotation; // 최대 회전수 (타이어 수명)
    public int accmulatedRotation;  // 누적 회전수
    public String location; // 타이어의 위치

    // 생성자
    public Tire(String location, int maxRotation) {
        this.location = location; // public String location 초기화
        this.maxRotation = maxRotation; // public int maxRotation 초기화
    }

    // 메소드
    public boolean roll() {
        ++accmulatedRotation;   // 누적 회전수 1 증가
        if (accmulatedRotation < maxRotation) {
            System.out.println(location + " Tire 수명: "  +
                    (maxRotation - accmulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " Tire 펑크 ***");
            return false;
        }
    }
}
