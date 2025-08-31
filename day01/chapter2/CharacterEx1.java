package chapter2;
// 문자형 연습

public class CharacterEx1 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1); // 문자 출력
        System.out.println((int)ch1); // 문자에 해당하는 정수값(아스키 코드값) 출력

        char ch2 = 66;  // 정수값 대입
        System.out.println(ch2); // 정수값에 해당하는 문자 출력

        int ch3 = 67;
        System.err.println(ch3);    // 문자 정수값 출력
        System.out.println((char)ch3);  // 정수값에 해당하는 문자 출력
    }
    
}
