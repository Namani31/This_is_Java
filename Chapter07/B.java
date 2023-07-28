package Chapter07;

public class B {
    public void method() {
        A a = new A();  // O
        a.field = "value";  // O
        a.method(); // O
    }
}
