package Chapter08;

public interface ChildInterface2 extends ParentInterface {

    @Override
    default void method2() {
        /* 실행문 */
    }

    // 추상 메소드
    public void method3();
}
