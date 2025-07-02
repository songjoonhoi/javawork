package singleton;
// 싱글톤 패턴 : 인스턴스를 단 하나만 생성
public class Commpany {
    private static Commpany instance = new Commpany(); // 유일하게 생성한 인스턴스
    private Commpany(){}

    public static Commpany getInstance(){
        if(instance == null){instance = new Commpany();}
        return instance;
    }


}
