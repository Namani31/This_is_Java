package Chapter10;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }

    public static void findClass() throws ClassNotFoundException {
        // Class.forName(): 물리적인 클래스 파일명을 인자로 넣어주면 이에 해당하는 클래스를 반환
        Class clazz = Class.forName("java.lang.String2");
    }
}
