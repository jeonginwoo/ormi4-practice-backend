package ch09_예외처리;

public class Sample2 {
    public static void main(String[] args) {
        int result;
        try {
            result = 3 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            result = -1;
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        }
    }
}
