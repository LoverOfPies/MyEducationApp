package test.oop;

public class WildAnimal extends Animal implements AnimalLive {
    private int size_fangs;

    //Конструктор по умолчанию
    public WildAnimal(){
    }

    //Конструктор копирования
    public WildAnimal(WildAnimal wildanimal){
        setName(wildanimal.getName());
    }

    //Конструктор с передачей параметров
    public WildAnimal(String name){
        setName(name);
    }

    public void hunt(){
        System.out.println("WildAnimal hunting");
    }

    //Переопределение методов интерфейса AnimalLive
    @Override
    public void eat(){
        System.out.println("WildAnimal eat");
    }

    public void sleep(){
        System.out.println("WildAnimal sleep");
    }
}