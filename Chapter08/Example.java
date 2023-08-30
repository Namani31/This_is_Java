package Chapter08;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA();
        // InterfaceA 변수는 methodA() 호출 가능
        System.out.println();

        InterfaceA ib = impl;
        ib.methodA();
        // InterfaceB 변수는 methodB() 호출 가능
        System.out.println();

        InterfaceC ic = impl;
        // InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능
        ic.methodA();
        ic.methodA();
        ic.methodA();
    }
}
