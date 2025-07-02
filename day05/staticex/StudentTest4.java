package staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 st1  = new Student2();
        st1.setStudentName("이홍시");
        System.out.println(Student2.getSerialNum());
        System.out.println(st1.studentName + " 학번: "+ st1.studentID);

        Student2 st2  = new Student2();
        st2.setStudentName("홍시");
        System.out.println(Student2.getSerialNum());
        System.out.println(st2.studentName + " 학번: "+ st2.studentID);

    }
}
