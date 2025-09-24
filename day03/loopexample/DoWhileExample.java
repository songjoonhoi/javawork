package loopexample;

// do - while문으로 1~10까지 더하기
public class DoWhileExample {
    public static void main(String[] args) {
    
        int num =1;
    int sum =0;

    do{ // 조건식이 참이 아니여도 무조건 한번 실행함
        sum += num;
        num ++;
    }while(num <=10);

    System.out.println(sum);
    }
    
    // 무조건 한번 수행한 후에 조건식을 검사 즉 조건을 만족하는지 여부를 마지막에 검사한다.

    
}
