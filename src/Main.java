/*
 * Это тестовое приложение написанное Ильей Антиповым
 * для улучшения своих навыков кодинга.
 * Тут я буду оставлять общие комментарии.
 *
 * Как человеку любящему Python мне тяжело менять стиль отступов
 * на 4 пробела вместо табуляции.
 *
 * В Java существует 50 зарезервированных слов,
 * два из них не используются: const, goto;
       - Примитивы (byte, short, int, long, char, float, double, boolean)
       - Циклы и ветвления (if, else, switch, case, default, while, do, break, continue, for)
       - Исключения (try, catch, finally, throw, throws)
       - Области видимости (private, protected, public)
       - Объявление \ Импорт (import, package, class, interface, extends, implements, static, final, void, abstract, native)
       - Создание \ Возврат \ Вызов (new, return, this, super)
       - Многопоточность (synchronized, volatile)
       - instanceof, enum, assert, transient, strictfp, const, goto
 *
 *
 */

import test.oop.HomeAnimal;
import test.syntax.Syntax; //Импорт класса Syntax из пакета test.syntax
import test.oop.WildAnimal;
import test.oop.AnimalLive;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*Выполнение программы на Java начинается с вызова метода main()
      он имеет модификатор доступа public - т.е. имеет доступ из любого другого кода проекта
      также модификатор static - что позволяет вызывать метод main() без экземпляра(объекта) класса Syntax
      и ключевое слово void - означает что main() не возвращает никаких значений
    */
    public static void main(String args[]) {
        //в выражении String args[] объявляется параметр
        //args обозначающий массив экземпляров класса String

        WildAnimal tiger = new WildAnimal("Tiger", 4, 12); //Создаём объект класса Animal с name = Cat
        WildAnimal wolf = new WildAnimal(); //Создаём объект класса Animal с полями по умолчанию
        HomeAnimal cat = new HomeAnimal("Cat", 8);

        // System.out.println(cat.name); //Ошибка так как поле name имеет модификатор private
        System.out.println(tiger.getName()); //Получаем имя животного через метод
        System.out.println(wolf.getName()); //Выведет null так как имя не было задано
        wolf.setName("Wolf"); //Задаем имя животного через метод
        System.out.println(wolf.getName()); //Теперь будет выведено Dog

        //Методы объекта Tiger
        tiger.hunt();

        AnimalLive[] animals = new AnimalLive[3];
        animals[0] = wolf;
        animals[1] = tiger;
        animals[2] = cat;

        for (AnimalLive animal : animals){
            animal.eat();
        }

        // Syntax.testNames(); //Можно вызвать метод без создания объекта класса, так как у него есть модификатор static
    }
}
