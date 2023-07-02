package Chapter03;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "김윤지";
        String strVar2 = "김윤지";
        String strVar3 = new String("김윤지");

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1 == strVar3);
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));
    }
}
