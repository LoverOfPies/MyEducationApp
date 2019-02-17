package test.oop;

public class HomeAnimal extends Animal implements AnimalLive {
    public HomeAnimal(){};

    public HomeAnimal(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){ System.out.println("Я " + getName() + " и я ем корм."); }

    public void sleep(){
        System.out.println("Я " + getName() + " и я сплю дома.");
    }
}
