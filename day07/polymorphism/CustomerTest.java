package day07.polymorphism;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setCustomerID(1001);
        c1.setCustomerName("이홍시");
        c1.bonusPoint = 1000;

        System.out.println(c1.showCustomerInfo());

        Customer c2 = new VIPCustomer(2001, "홍쿠", 1234);
        c2.bonusPoint = 1000;

        System.out.println(c2.showCustomerInfo());

        System.out.println("==========할인율과 보너스 포인트 계산");

        int price = 10000;
        int leePrice = c1.calcPrice(price);
        int kimPrice = c2.calcPrice(price);

        System.out.println(c1.getCustomerName() + "님이 " + leePrice + "원 지불 하셨습니다.");
        System.out.println(c1.showCustomerInfo());

        System.out.println(c2.getCustomerName() + "님이 " + kimPrice + "원 지불 하셨습니다.");
        System.out.println(c2.showCustomerInfo());
    }
}
