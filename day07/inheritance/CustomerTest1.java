package day07.inheritance;
// 상속 1
public class CustomerTest1 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setCustomerID(1001);
        c1.setCustomerName("이홍시");
        c1.bonusPoint=1000;
        System.out.println(c1.showCustomerInfo());

        VIPCustomer c2 = new VIPCustomer();
        c2.setCustomerID(2000);
        c2.setCustomerName("홍쿠");
        c2.bonusPoint = 10000;
        System.out.println(c2.showCustomerInfo());
    }
}
