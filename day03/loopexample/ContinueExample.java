package loopexample;

// continue문을 활용하여 1 ~ 100까지 홀수만 더하기
public class ContinueExample {
    public static void main(String[] args) {
        int total =0;
        int num;

        for(num =1; num <= 100; num++){
            if(num % 2 == 0){
                continue;
            }
            total += num;
        }
        System.out.println(total);
    }
    
}
