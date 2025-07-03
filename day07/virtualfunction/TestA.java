package day07.virtualfunction;

// 가상 메서드
public class TestA {
    int num;
    
    void aaa(){
        System.out.println("aaa () 출력");
    }

    public static void main(String[] args) {
        TestA t = new TestA();
        t.aaa();

        TestA t1 = new TestA();
        t1.aaa();
    }
}
