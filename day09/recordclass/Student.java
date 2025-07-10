package day09.recordclass;

import java.util.Objects;
// 변하지 않는 데이터 객체를 정의하는 record 클래스

public class Student {
    
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    @Override
    public boolean equals(Object o){
        if(this == o){return true;}
        if(o == null || getClass() != o.getClass()){return false;}
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }

    @Override
    public String toString(){
        return "Student{" + 
                "id= " + id +
                ", name ='" + name + '\'' + 
                '}';
    }

    public static void main(String[] args) {
        Student st1 = new Student(12345, "이홍시");
        Student st2 = new Student(12345, "이홍시");

        System.out.println(st1);
        System.out.println(st1.equals(st2));
        st1.setName("홍시");
        System.out.println(st1.getName());
    }
}
