package Chapter06;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "태백");

        System.out.println(p1.nation);
        System.out.println(p1.name);
        System.out.println(p1.ssn);

        // p1.nation = "usa";
        // p1.ssn= "654321-7654321"; // final 필드는 수정 불가
        p1.name="이순신";
        System.out.println(p1.name);
    }
}
