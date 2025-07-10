package day09.object;

public class StringEquals {
    public static void main(String[] args) {
        String st1 = new String("abc");
        String st2 = new String("abc");

        System.out.println(st1 == st2
        );
        System.out.println(st1.equals(st2));

    }
}
