package day07.gamelevel;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("엄청 빨리 달리기");
    }

    @Override
    public void jump() {
        System.out.println("이단 뛰기");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 턴");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급 레벨");
    }
    
}
