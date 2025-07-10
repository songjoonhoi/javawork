package day09.recordclass;

public record StudentInfo(int id, String name) {
    public static void main(String[] args) {
        
        StudentInfo st1 = new StudentInfo(12345, "이홍쿠");
        StudentInfo st2 = new StudentInfo(12345, "이홍쿠");

        System.out.println(st1.equals(st2));
        System.out.println(st1.name());
        System.out.println(st1);
    }
}
