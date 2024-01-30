package Daily_Quiz;

public class Q2 {
    public static void main(String args[]) {
        // for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
        int[] array = {12, 4, 7, 20, 1};

        // 코드 작성하는 부분
        int sum = 0;
        int max = array[0];
        double avg;
        for (int num : array) {
            if (max < num){
                max = num;
            }
            sum += num;
        }
        avg = (double) sum / array.length;
        // ...

        // 결과 출력 (최대값: max, 평균: avg)
        System.out.println(max);
        System.out.println(avg);
    }
}
