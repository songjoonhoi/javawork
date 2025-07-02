package staticex;

public class StudentTest2 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.setStudentName("홍쿠");
        System.out.println(st1.serialNum);
        System.out.println(st1.studentName + " 학번: "+ st1.studentID);

        Student1 st2 = new Student1();
        st2.setStudentName("이홍찌");
        System.out.println(st2.serialNum);
        System.out.println(st2.studentName + " 학번: "+ st2.studentID);

    }
}
