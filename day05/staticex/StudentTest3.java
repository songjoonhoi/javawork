package staticex;

// static 변수는 클래스 변수라고 하고 클래스에 속해 한번만 생성되는 변수이고 이를 여러 인스턴스가 공유한다.
public class StudentTest3 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.setStudentName("홍쿠");
        System.out.println(Student1.serialNum);
        System.out.println(st1.studentName + " 학번: "+ st1.studentID);

        Student1 st2 = new Student1();
        st2.setStudentName("이홍찌");
        System.out.println(Student1
        .serialNum);
        System.out.println(st2.studentName + " 학번: "+ st2.studentID);

    }
}
