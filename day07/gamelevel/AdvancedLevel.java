package day07.gamelevel;

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
       System.out.println("빨리 달리기");
    }

    @Override
    public void jump() {
        System.out.println("높이 뛰기");
    }

    @Override
    public void turn() {
        System.out.println("레벨이 낮아");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급자 레벨");
    }
    
}
