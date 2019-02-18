package test.oop;

public abstract class Animal  implements AnimalLive  {
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

    public void setAge(int age){ this.age = age; }
    public int getAge(){
        return age;
    }

    //Переопределение методов интерфейса AnimalLive
    @Override
    public void eat(){ System.out.println("Я " + getName() + " и я ем"); }
    public void sleep(){ System.out.println("Я " + getName() + " и я сплю"); }
}