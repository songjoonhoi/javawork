package loopexample;
// while문을 활용하여 1~10까지 더하기
public class WhileExample1 {
    public static void main(String[] args) {
        int num=1;
        int sum =0;

        while (num <= 10) {
            sum +=num;
            num ++;
        }
        System.out.println(sum);
    }
    
}
