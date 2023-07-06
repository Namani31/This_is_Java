package Chapter05;

public class Exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int cnt = 0;    // array 배열의 데이터 총 개수를 구함
        double avg = 0.0;

        for (int row = 0; row < array.length; row++) {  // 행
            for (int col = 0; col < array[row].length; col++) {  // 열
                sum += array[row][col];
                cnt++;
            }
        }
        avg = (double) sum / cnt;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
