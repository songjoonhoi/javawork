package singleton;

public class CommpanyTest {
    public static void main(String[] args) {
        Commpany c1 = Commpany.getInstance();
        Commpany c2 = Commpany.getInstance();

        System.out.println(c1 == c2);
    }
}
