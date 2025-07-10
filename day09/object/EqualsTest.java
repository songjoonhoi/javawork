package day09.object;

public class EqualsTest {
    public static void main(String[] args) {
        
        Student st1 = new Student(100, "이홍시");
        Student st2 = st1;
        Student st3 = new Student(100, "이홍시");

        if( st1 == st2){
            System.out.println("st1과 st2의 주소는 같음");
        }else{
            System.out.println("st1과 st2의 주소는 다름");
        }

        if(st1.equals(st2)){
            System.out.println("st1과 st2는 동일합니다.");
        }else{
            System.out.println("st1과 st2는 다름");
        }

        if( st1 == st3){
            System.out.println("st1과 st3의 주소는 같음");
        }else{
            System.out.println("st1과 st3의 주소는 다름");
        }

        if(st1.equals(st3)){
            System.out.println("st1과 st3는 동일합니다.");
        }else{
            System.out.println("st1과 st3는 다름");
        }

        System.out.println("st1의 hashCode: "+ st1.hashCode());
        System.out.println("st3의 hashCode: "+ st3.hashCode());
        System.out.println("st1의 실제 주소값 "+ System.identityHashCode(st1));
        System.out.println("st3의 실제 주소값 "+ System.identityHashCode(st3));

    }
}

class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString(){
        return studentId + "," + studentName;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student std = (Student)obj;
            if(this.studentId == std.studentId){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return studentId;
    }
}