package test.oop;

import test.exceptions.AgeException;

public class HomeAnimal extends Animal{

    public HomeAnimal(){};

    public HomeAnimal(String name, int age){
        super(name, age);
    }

    public void setCat(String name){
        //Вложенный класс Cat
        class Cat{
            void write(){
                System.out.println("Это кот " + name);
                eat(); //может использовать методы главного класса
            }
        }

        Cat cat = new Cat();
        cat.write();

    }
    @Override
    public void eat(){ System.out.println("Я " + getName() + " и я ем корм."); }

    public void sleep(){
        System.out.println("Я " + getName() + " и я сплю дома.");
    }
}
