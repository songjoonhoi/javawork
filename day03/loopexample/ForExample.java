package loopexample;

//for 문으로 1부터 10까지 더하기 

public class ForExample {
    public static void main(String[] args) {
        int i;
        int sum;
        for(i=1, sum =0; i<=10; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
    
}
