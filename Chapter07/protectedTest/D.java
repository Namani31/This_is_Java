package Chapter07.protectedTest;

import Chapter07.A;

public class D extends A {
    public D() {
        super();    // O, A 생성자 호출
        this.field = "value";   // O
        this.method();  // O
    }
}
