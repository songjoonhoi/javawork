package staticex;

public class Student1 {
    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String adderss;

public Student1(){
    serialNum++; // 학생이 생성될때 마다 증가
    studentID = serialNum; // 증가된 학번 인스턴스 변수에 부여
}

public String getStudentName(){return studentName;}

public void setStudentName(String name){studentName = name;}

}
