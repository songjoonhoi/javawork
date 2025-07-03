package day07.polymorphism;

import java.util.ArrayList;

public class AnimalTest1 {
    ArrayList<Animal> al = new ArrayList<Animal>();
    public static void main(String[] args) {
        // AnimalTest1 a = new AnimalTest1();
        // a.moveAnimal(new person());
        // a.moveAnimal(new Tiger());
        // a.moveAnimal(new Eagle());

        AnimalTest1 at= new AnimalTest1();
        at.addAnimal();
        System.out.println("=====원래 형으로 다운 캐스팅=====");
        at.testCasting();

    }


// public void moveAnimal(Animal animal){
//     animal.move();
// }

    public void addAnimal(){
        al.add(new person());
        al.add(new Tiger());
        al.add(new Eagle());

        for(Animal a : al){
            a.move();
        }
    }

    public void testCasting(){
        for(int i =0; i< al.size(); i++){
            Animal a = al.get(i);
            if(a instanceof person){
                person p = (person)a;
                p.readBook();
            }else if(a instanceof Tiger){
                Tiger t = (Tiger)a;
                t.huting();
            }else if(a instanceof Eagle){
                Eagle e = (Eagle)a;
                e.flying();
            }else{
                System.out.println("없음");
            }
        }
    }
}
