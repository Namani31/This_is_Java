package Chapter03;

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        // c2 에 1을 더하면 c2는 int 타입 변환 되고 1과 연산 되므로 산출 타입이 int가 됨
        // 따라서 char 타입 변수 c3에 대입 불가
        // char c3 = c2 + 1; // 연산자 에러

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        // System.out.println("c3: " + c3);
    }
}
