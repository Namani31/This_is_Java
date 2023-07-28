package Chapter07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;  // 자동 타입 변환
        parent.mathod1();
        parent.method2();   // 재정의 된 메소드가 호출 됨
        // parent.method3(); // 호출 불가
    }
}
