package day09.string;

public class StringTest2 {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String androidStr = new String("adrodid");

        System.out.println(javaStr);
        System.out.println("처음 문자열 주솟값: " + System.identityHashCode(javaStr));

        javaStr = javaStr.concat(androidStr);

        System.out.println(javaStr);
        System.out.println("처음 문자열 주솟값: " + System.identityHashCode(javaStr));
    }
}
