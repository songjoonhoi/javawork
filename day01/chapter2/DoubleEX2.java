package chapter2;
// 부동의 소주섬 방식에 오차가 있다.
public class DoubleEX2 {
    public static void main(String[] args) {
        double dnum = 1;

        for( int i =0; i<10000; i++){
            dnum = dnum + 0.1;
        }
        System.out.println(dnum);
        // 지수와 기수로 나타내는 부동 소수점 방식은 지수로 표현되는 값이 0을 나타낼수 없다.
        // 따라서 부동 소수점 값을 연산하면 오차가 약간 발생
        // 약간의 오타를 감수하고라도 더 넓은 범위의 실수값을 표현하기 위해 부동 소수점 방식을 사용한다.
    }
}
