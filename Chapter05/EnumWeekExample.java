package Chapter05;

import java.sql.SQLOutput;
import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        // 열거 타입 변수 선언
        Week today = null;

        // 일~토까지의 숫자를 리턴
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                // 열거 상수 대입
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

        System.out.println("오늘 요일: " + today);

        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 게임을 합니다.");
        } else {
            System.out.println("열심히 자바 공부합니다.");
        }
    }
}
