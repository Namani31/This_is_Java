package Chapter06.exam02_constructor_access.package1;

public class A {
    // 필드
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    // 생성자
    public A(boolean b) {}
    A(int b) {} // default 접근 제한
    private A(String s) {}
}
