package staticex;

// static 메서드 = 클래스 메서드
public class Student2 {
    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student2(){serialNum++; studentID = serialNum;}

    public String gerStudentName(){return studentName;}

    public void setStudentName(String name){studentName = name;}

    public static int getSerialNum(){int i =10; return serialNum;}
    public static void setSerialNem(int serialNum){Student2.serialNum = serialNum;}
}
