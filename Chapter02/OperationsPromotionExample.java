package Chapter02;

public class OperationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        // 정수 연산은 int 타입이 기본
        // byte byteValue3 = byteValue1 + byteValue2;
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
        // char 타입도 4byte보다 작으므로 int로 변환됨
        // char charValue3 = charValue1 + charValue2;
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드=" + intValue2);
        System.out.println("출력문자=" + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);

        int intValue5 = 10;
        // int 타입은 4byte, double 타입은 8byte라서 double로 담아야함
        // int intValue6 = 10 / 4.0;
        double doubleValue = intValue5 / 4.0;
        System.out.print(doubleValue);
    }
}
