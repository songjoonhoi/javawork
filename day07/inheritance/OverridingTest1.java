package day07.inheritance;

public class OverridingTest1 {
    public static void main(String[] args) {
        
    Customer c1 = new Customer(1001, "이순신");
    c1.bonusPoint = 1000;

    VIPCustomer c2 = new VIPCustomer(2001, "김유신", 1234);
    c2.bonusPoint = 10000;
    
    int price = 10000;
    System.out.println(c1.getCustomerName() + "님이 지불해야하는 금액은 " + c1.calcPrice(price)+ "원 입니다.");

    System.out.println(c2.getCustomerName()+ "님이 지불해야할 금액은 " + c2.calcPrice(price)+ "원 입니다.");
    
}

}