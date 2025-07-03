package day07.inheritance;

public class OverridingTest3 {
    public static void main(String[] args) {
        int price = 10000;

        Customer c1 = new Customer(1010, "이홍시");
        System.out.println(c1.getCustomerName() + "님이 지불해야할 금액은 " + c1.calcPrice(price) + "원 입니다.");

        VIPCustomer c2 = new VIPCustomer(2020, "홍시파파", 1234);
        System.out.println(c2.getCustomerName() + "님이 지불해야할 금액은 " + c2.calcPrice(price) + "원 입니다.");

        Customer v = new VIPCustomer(2050, "형변환", 2000);
        System.out.println(v.getCustomerName() + "님이 지불해야할 금액은 " + v.calcPrice(price) + "원 입니다.");
    }
}
