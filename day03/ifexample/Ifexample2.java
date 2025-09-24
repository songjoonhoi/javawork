package ifexample;

// if-else if-else문으로 입장료 계산하기
public class Ifexample2 {
    
    public static void main(String[] args) {
        int age =9;
        int charge;

        if(age < 8){
            charge = 1000;
            System.out.println("아동");
        }else if(age < 14){
            charge = 2000;
            System.out.println("초등학생");
        }else if(age > 20){
            charge =2500;
            System.out.println("중고등학생");
        }else{
            charge = 3000;
            System.out.println("성인");
        }
        System.out.println("입장료는 "+ charge + "원입니다.");

    }
}
