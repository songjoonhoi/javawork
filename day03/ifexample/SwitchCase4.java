package ifexample;
// 표현식 구하기
public class SwitchCase4 {
    public static void main(String[] args) {
    
        String medal = "Gold";

        String message = switch(medal){
            case "Gold" -> "금메달";
            case "silver" -> "은메달";
            case "bronze" -> "동메달";
            default -> "메달이 없습니다.";
        };

        System.out.println(message);
    }
    


}
