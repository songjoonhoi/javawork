package day07.gamelevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run(){
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump(){
        System.out.println("할수 없음");
    }

    @Override
    public void turn(){
        System.out.println("레벨이 낮음");
    }

    @Override
    public void showLevelMessage(){
        System.out.println("초급자 레벨");
    }
}
