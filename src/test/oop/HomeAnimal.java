package test.oop;

public class HomeAnimal extends Animal implements AnimalLive {

    @Override
    public void eat(){
        System.out.println("HomeAnimal eat");
    }

    public void sleep(){
        System.out.println("HomeAnimal sleep");
    }
}
