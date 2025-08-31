package chapter2;
// 상수 사용하기
public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100;    // 선언과 동시에 초기화
        final int MIN_NUM;

        MIN_NUM =0; // 초기화하지 않으면 오류가 발생하므로 사용하기 전 반드시 초기화

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
    
}
