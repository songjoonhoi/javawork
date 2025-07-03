package day07.inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer  c = new VIPCustomer(2001,"홍시", 1234);
        // c.setCustomerID(2001);
        // c.setCustomerName("홍시");
        c.bonusPoint = 10000;
        System.out.println(c.showCustomerInfo()
        );
    }
}
