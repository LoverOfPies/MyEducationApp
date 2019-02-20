package test.oop;

import test.exceptions.AgeException;

public abstract class Animal  implements Live  {
    private String name;
    private int age;

    public Animal(){
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){ this.name = name; }
    public String getName(){
        return name;
    }

    public void setAge(int age) throws AgeException  {
        if (age<0) throw new AgeException("Age less than 0", age);
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    //Переопределение методов интерфейса AnimalLive
    @Override
    public void eat(){ System.out.println("Я " + getName() + " и я ем"); }
    public void sleep(){ System.out.println("Я " + getName() + " и я сплю"); }
}