package day07.gamelevel;


public class MainBoard {
    public static void main(String[] args) {
        Player p = new Player();
        p.play(1);

        AdvancedLevel a1 = new AdvancedLevel();
        p.upgradeLevel(a1);
        p.play(2);

        SuperLevel s1 = new SuperLevel();
        p.upgradeLevel(s1);
        p.play(3);

    }
}
