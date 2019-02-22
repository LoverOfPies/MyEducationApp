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

import test.collections.ListCollection;
import test.collections.MapCollection;
import test.collections.SetCollection;
import test.exceptions.AgeException;
import test.oop.AnimalsName;
import test.oop.HomeAnimal;
import test.syntax.Syntax; //Импорт класса Syntax из пакета test.syntax
import test.oop.WildAnimal;
import test.oop.Animal;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*Выполнение программы на Java начинается с вызова метода main()
      он имеет модификатор доступа public - т.е. имеет доступ из любого другого кода проекта
      также модификатор static - что позволяет вызывать метод main() без экземпляра(объекта) класса Syntax
      и ключевое слово void - означает что main() не возвращает никаких значений
    */
    public static void main(String args[]){
        // в выражении String args[] объявляется параметр
        // args обозначающий массив экземпляров класса String

        Animal tiger = new WildAnimal("Tiger", 4, 12); //Создаём объект класса Animal с name = Cat
        Animal wolf = new WildAnimal(); //Создаём объект класса Animal с полями по умолчанию
        Animal cat = new HomeAnimal("Cat", 8);
        Animal puma = new WildAnimal("Puma");


        // System.out.println(cat.name); //Ошибка так как поле name имеет модификатор private
        System.out.println(tiger.getName()); //Получаем имя животного через метод
        System.out.println(wolf.getName()); //Выведет null так как имя не было задано
        wolf.setName("Wolf"); //Задаем имя животного через метод
        System.out.println(wolf.getName()); //Теперь будет выведено Dog

        // Методы объекта Tiger, с приведением типов
        ((WildAnimal) tiger).hunt();
        ((WildAnimal) wolf).setSize_fangs(13);
        System.out.println(((WildAnimal) wolf).getSize_fangs());

        ((HomeAnimal) cat).setCat("Барсик");
        ((WildAnimal) puma).printData();

        //Массив всех животных
        Animal[] animals = new Animal[3];
        animals[0] = wolf;
        animals[1] = tiger;
        animals[2] = cat;

        // Реализация полиморфизма
        for (Animal animal : animals){
            animal.eat();
            animal.sleep();
        }

        for (AnimalsName s : AnimalsName.values())
            System.out.println(s.ordinal() + ": " + s);

        try {
            cat.setAge(-1);
        }catch (AgeException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getAge());
        }

        // Syntax.testNames(); //Можно вызвать метод без создания объекта класса, так как у него есть модификатор static



        // Collections

        // Некоторые из методов Collections
        //
        // Сигнатура метода                                                Описание
        // Collections.sort(List myList)                                   Сортирует список в естественном порядке.
        // Collections.sort(List, Comparator c)                            Сортировка с использованием компаратора.
        // Collections.shuffle(List myList)                                Перемешивает коллекцию в случайном порядке.
        // Collections.reverse(List myList)                                Переворачивает коллекцию в обратном порядке.
        // Collections.binarySearch(List mlist, T key)                     Поиск в коллекции по ключу с использованием бинарного поиска.
        // Collections.copy(List dest, List src)                           Копирует коллекцию источник src в dest.
        // Collections.frequency(Collection c, Object o)                   Возвращает число вхождений объекта в коллекции.
        // Collections.synchronizedCollection(Collection c)                Возвращает синхронизированную (потокобезопасную) коллекцию.

        // Коллекциями/контейнерами в Java принято называть классы,
        // основная цель которых – хранить набор других элементов.
        //
        // Массивы обладают значительными недостатками. Одним из них является конечный размер массива,
        // как следствие, необходимость следить за размером массива. Другим — индексная адресация,
        // что не всегда удобно, т.к. ограничивает возможности добавления и удаления объектов.
        // Чтобы избавиться от этих недостатков уже несколько десятилетий программисты используют рекурсивные типы данных,
        // такие как списки и деревья. Стандартный набор коллекций Java служит для избавления программиста от
        // необходимости самостоятельно реализовывать эти типы данных и снабжает его дополнительными возможностями.
        //
        // Коллекции могут хранить любые ссылочные типы данных.
        //
        // List — это упорядоченный список. Объекты хранятся в порядке их добавления в список.
        // Доступ к элементам списка осуществляется по индексу.
        // List Collection
        ListCollection listCollection = new ListCollection();
        listCollection.setArrayList();
        listCollection.setLinkedList();

        // Set — множество неповторяющихся объектов.
        // В коллекции этого типа разрешено наличие только одной ссылки типа null.
        // Set Collection
        SetCollection setCollection = new SetCollection();
        setCollection.setSortedSet();
        setCollection.setNavigableSet();
        setCollection.setTreeSet();
        setCollection.setLinkedHashSet();
        setCollection.setHashSet();

        // Queue — коллекция, предназначенная для хранения элементов в порядке, нужном для их обработки.
        // В дополнение к базовым операциям интерфейса Collection,
        // очередь предоставляет дополнительные операции вставки, получения и контроля.
        // Очереди обычно, но не обязательно, упорядочивают элементы в
        // FIFO (first-in-first-out, «первым вошел — первым вышел») порядке.
        //
        // Map<K,V> используется для отображения каждого элемента из одного множества объектов
        // (ключей) на другое (значений). При этом, каждому элементу из множества ключей ставится
        // в соответствие множество значений. В то же время одному элементу из множества значений
        // может соответствовать 1, 2 и более элементов из множества ключей.
        // Интерфейс java.util.Map<K,V> описывает функциональность ассоциативных массивов.
        // Map Collection
        MapCollection mapCollection = new MapCollection();
        mapCollection.setHashMap();
        mapCollection.setLinkedHashMap();
        mapCollection.setTreeMap();

        // Итератор — объект, позволяющий перебирать элементы коллекции.
        // Например foreach реализован с использованием итератора.
        // Одним из ключевых методов интерфейса Collection является метод Iterator<E> iterator().
        // Он возвращает итератор — то есть объект, реализующий интерфейс Iterator.

        // Set и List оба унаследованы от Collection, а значит имеют одинаковый набор и сигнатуры методов.
        // List хранит объекты в порядке вставки, элемент можно получить по индексу.
        // Set не может хранить одинаковых элементов.
    }
}
