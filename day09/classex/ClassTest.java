package day09.classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException{
        Person person = new Person();
        Class pClass = person.getClass();
        System.out.println(pClass.getName());
        
        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("day09.classex.Person");
        System.out.println(pClass3.getName());
    }
}
