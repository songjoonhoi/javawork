package ifexample;

// break문 없는 switch-case문 구현하기
public class SwitchCase3 {
    public static void main(String[] args) {
        String medal = "gold";

        switch (medal) {
            case "gold" -> System.out.println("금메달");
            case "silver" -> System.out.println("은메달");
            case "bronze" -> System.out.println("동메달");
            default -> System.out.println("메달이 없습니다.");
                
        }
    }
}
