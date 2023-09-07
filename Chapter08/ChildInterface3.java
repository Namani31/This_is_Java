package Chapter08;

public interface ChildInterface3 extends ParentInterface {
    @Override
    public void method2(); // 추상 메소드로 재선언 (오버라이딩)
    public void method3();
}
