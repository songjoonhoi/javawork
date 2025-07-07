package day08.interfaceex;

public abstract class Calculator implements Calc{
    
    // 추상메서드
    @Override
    public int add(int num1, int num2){
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2){
        return num1 -num2;
    }
}
