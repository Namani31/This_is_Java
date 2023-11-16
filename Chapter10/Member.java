package Chapter10;

import Chapter06.Car;

import java.util.Arrays;

public class Member implements Cloneable {
    public String id;
    public String name;
    public int[] scores;
    public Car car;

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 먼저 얕은 복사를 해서 name, age를 복제한다.
        Member cloned = (Member) super.clone();
        // scores를 깊은 복제한다.
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        // car를 깊은 복제한다.
        cloned.car = new Car(this.car.model);
        // 깊은 복제 된 Member 객체를 리턴
        return cloned;
    }

    public Member getMember() {
        Member cloned = null;

        try {// clone() 메소드의 리턴 타입은 Object 이므로 Member 타입으로 캐스팅 해야 함
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) { }
        return cloned;
    }
}