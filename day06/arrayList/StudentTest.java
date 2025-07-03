package day06.arrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(1001, "Lee");
        st1.addSubject("국어", 100);
        st1.addSubject("수학", 50);

        Student st2 = new Student(1002, "kim");
        st2.addSubject("국어", 70);
        st2.addSubject("수학 ", 85);
        st2.addSubject("영어", 100);

        st1.showStudentInfo();
        System.out.println("==================");
        st2.showStudentInfo();
    }
}
