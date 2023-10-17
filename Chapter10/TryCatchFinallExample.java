package Chapter10;

public class TryCatchFinallExample {
    public static void main(String[] args) {
        try {
            // 해당 매채 정보를 clazz 에 넣음
            Class clazz = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
