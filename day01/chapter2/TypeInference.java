package chapter2;
// var를 사용해 변수 선언하기
public class TypeInference {
    public static void main(String[] args) {
    
        var i =10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        // str = 3; // str 변수는 String형으로 먼저 사용했기 때문에 정수값을 넣을 수 없음
}    
}
