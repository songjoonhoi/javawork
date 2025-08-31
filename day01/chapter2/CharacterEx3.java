package chapter2;
// 문자형 연습: 음수 오류 확인
public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65;
        int b = -65;

        char a2 = 65;
        // char b2 = -65; // 문자형 변수에 음수를 넣으면 오류가 발생    

        System.out.println((char)a);
        System.out.println((char)b);
        System.out.println(a2);
    }
}
