package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setStudentName("이홍시");
        System.out.println(st1.serialNum);
        st1.serialNum++;

        Student st2 = new Student();
        st1.setStudentName("홍시");
        System.out.println(st2.serialNum);
        System.out.println(st1.serialNum);
    }
}
