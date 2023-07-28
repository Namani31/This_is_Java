package Chapter07;

calss A() {}

class B extend A {}
class C extend A {}
class D extend B {}
class E extend C {}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // B b3 = e;    // 상속 관계에 있지 않음
        // C c2 = d;
    }
}
