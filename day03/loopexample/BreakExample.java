package loopexample;

// break문으로 반복문 빠져나가기
public class BreakExample {
    public static void main(String[] args) {
        int sum =0;
        int num = 0;

        for(num =0; ; num++){
            sum += num;
            if(sum >= 100) break;
        }
        System.out.println(num);
        System.out.println(sum);
    }
    
}
