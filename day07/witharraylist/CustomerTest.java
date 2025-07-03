package day07.witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer c1 = new Customer(1001, "이순신");
        Customer c2 = new GoldCustomer(1010, "이");
        Customer c3 = new Customer(1020, "순신");
        Customer c4 = new Customer(1030, "이신");
        Customer c5 = new VIPCustomer(1040, "신", 1234);

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);

        System.out.println("==== 고객 정보 출력 ====");
        for(Customer c : customerList){
            System.out.println(c.showCustomerInfo());
        }

        System.out.println("===== 할인율과 보너스 포인트 계산 =====");
        int price = 10000;
        for(Customer c : customerList){
            int cost = c.calcPrice(price);
        System.out.println(c.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
        System.out.println(c.getCustomerName() + " 님의 현재 보너스 포인트는 "+ c.bonusPoint + " 점입니다.");
        }

    }

}
