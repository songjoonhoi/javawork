package day09.object;


// String 클래스의 HashCode() 메서드 사용
public class HashCodeTest {
    public static void main(String[] args) {
        String st1 = new String("abc");
        String st2 = new String("abc");

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}
