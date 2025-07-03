package day07.inheritance;

public class OverridingTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(1003, "형변환", 2000);
        vc.bonusPoint = 1000;

        System.out.println(vc.getCustomerName() + "님이 지불해야할 금액은 "+ vc.calcPrice(10000) + "원 입니다.");
    }
}
