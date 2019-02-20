package test.oop;

import test.exceptions.AgeException;

public class WildAnimal extends Animal {
    private int size_fangs;

    //Конструктор по умолчанию
    public WildAnimal(){
    }

    //Конструктор копирования
    public WildAnimal(WildAnimal wildanimal){
        setName(wildanimal.getName());
        try{setAge(wildanimal.getAge());} catch (AgeException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getAge());
        }

        this.size_fangs = wildanimal.getSize_fangs();
    }

    //Конструктор с передачей параметров
    public WildAnimal(String name, int age, int size_fangs){
        super(name, age);
        this.size_fangs = size_fangs;
    }

    public WildAnimal(String name, int age){
        super(name, age);
        this.size_fangs = 0;
    }

    public WildAnimal(String name){
        super(name, 0);
        this.size_fangs = 0;
    }

    public void printData(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(size_fangs);
    }

    public int getSize_fangs(){ return this.size_fangs; }
    public void setSize_fangs(int size_fangs){ this.size_fangs =size_fangs; }

    public void hunt(){ System.out.println(getName() + " hunting"); }

    //Переопределение методов интерфейса AnimalLive
    @Override
    public void eat(){ System.out.println("Я " + getName() + " и я ем мясо!"); }
    public void sleep(){
        System.out.println("Я " + getName() + " и я сплю на улице.");
    }
}