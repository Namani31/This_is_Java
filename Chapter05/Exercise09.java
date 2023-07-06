package Chapter05;

import java.util.Scanner;

public class Exercise09 {
    public static void main (String[] args){
        boolean run = true;
        int studentNum = 0; // 학생 수
        int[ ] scores = null;   // 점수

        Scanner scanner = new Scanner(System.in);
        while (run){
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------------------------");
            System.out.print("선택 >");

            int selectNo = scanner.nextInt();

            if(selectNo == 1){  // 학생 수
                System.out.print("학생수>");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            } else if (selectNo == 2){  // 점수 입력
                for (int loop = 0; loop < studentNum; loop++) {
                    System.out.print("scores[" + loop + "]>");
                    scores[loop] += scanner.nextInt();
                }
            } else if (selectNo == 3){  // 점수 리스트
                for (int loop = 0; loop < scores.length; loop++) {
                    System.out.println("scores[" + loop + "]>" + scores[loop]);
                }
            }else if (selectNo == 4){   // 분석
                int maxScore = 0;
                double avgScore = 0;
                int sum = 0;

                for(int loop = 0; loop < scores.length; loop++) {
                    if (scores[loop] > maxScore) {
                        maxScore = scores[loop];
                    }
                    sum += scores[loop];
                }
                avgScore = (double) sum / scores.length;

                System.out.println("최고 점수>" + maxScore);
                System.out.println("평균 점수>" + avgScore);
            }else if (selectNo == 5){
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
