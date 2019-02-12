package test.OOP;

public class Animal {
    private String name;  //Объявление поля name

    //Конструктор по умолчанию
    public Animal(){
    }

    //Конструктор копирования
    public Animal(Animal animal){
        this.name = animal.getName();
    }

    //Конструктор с заданием параметров
    public Animal(String name){
        this.setName(name);
    }

    //Метод для задания поля name
    public void setName(String name){
        this.name = name;
    }

    //Метод для получения поля name
    public String getName(){
        return name;
    }
}
