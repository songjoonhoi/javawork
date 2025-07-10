package day09.string;

//주솟값 비교하기

public class StringTest1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // 인스턴스가 매번 새로 생성되므로 str1과 str2dml 주솟값이 다름
        System.out.println(str1.equals(str2)); // 문자열값은 같으므로 True

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4); // 문자열 abc는 상수 풀에 저장되어 있으므로 str3과 str4가 가리키는 주솟값이 같음
        System.out.println(str3.equals(str4));
    }
}
