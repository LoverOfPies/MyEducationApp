package test.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ListCollection {
    // http://habrahabr.ru/post/128269/ - интересная статья про структуры данных

    // Описание               Операция        ArrayList      LinkedList
    // Взятие элемента        get             Быстро         Медленно
    // Присваивание элемента  set             Быстро         Медленно
    // Добавление элемента    add             Быстро         Быстро
    // Вставка элемента       add(i, value)   Медленно       Быстро
    // Удаление элемента      remove          Медленно       Быстро

    // Если необходимо вставлять (или удалять) в середину коллекции много элементов,
    // то лучше использовать LinkedList. Во всех остальных случаях – ArrayList.

    // LinkedList требует больше памяти для хранения такого же количества элементов,
    // потому что кроме самого элемента хранятся еще указатели на следующий и предыдущий элементы списка,
    // тогда как в ArrayList элементы просто идут по порядку

    // ArrayList реализован внутри в виде обычного массива.
    // Поэтому при вставке элемента в середину, приходится сначала сдвигать на один все элементы после него,
    // а уже затем в освободившееся место вставлять новый элемент.
    // Зато в нем быстро реализованы взятие и изменение элемента –
    // операции get, set, так как в них мы просто обращаемся к соответствующему элементу массива.

    // НЕ ИСПОЛЬЗУЮТСЯ!
    // Vector — это способный увеличивать число своих элементов массив ссылок на объекты.
    // Внутри себя Vector реализует стратегию динамического расширения,
    // позволяющую минимизировать неиспользуемую память и количество операций по выделению памяти.
    //
    // Stack - является подклассом класса Vector, который реализует простой механизм типа
    // "последний вошёл - первый вышел" (LIFO). Можно представить процесс в виде детской пирамидки,
    // когда вы по одному нанизываете диск на колышек. И снять диски вы сможете только по порядку,
    // начиная с верхнего.

    public void setArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("ArrayList");

        arrayList.add(3);
        arrayList.add(4);

        System.out.println(arrayList);

        arrayList.add(0, 1);
        arrayList.set(1,2);

        System.out.println(arrayList);

        //IndexOutOfBoundsException
        //arrayList.add(5,3);
        //System.out.println(arrayList.get(8));

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(0);
        System.out.println(arrayList2);
        arrayList2.addAll(arrayList);
        System.out.println(arrayList2);
        System.out.println(arrayList2.get(3));
        System.out.println(arrayList2.remove(1));
        System.out.println(arrayList2);
        System.out.println();
    }

    // LinkedList реализован внутри по-другому.
    // Он реализован в виде связного списка: набора отдельных элементов,
    // каждый из которых хранит ссылку на следующий и предыдущий элементы.
    // Чтобы вставить элемент в середину такого списка, достаточно поменять ссылки его будущих соседей.
    // А вот чтобы получить элемент с номером 130, нужно пройтись последовательно по всем объектам от 0 до 130.
    // Другими словами операции set и get тут реализованы очень медленно.
    public void setLinkedList(){
        LinkedList<String> linkedList = new LinkedList<>();

        String[] strings = new String[] {"abc", "123", "kkk"};

        Collections.addAll(linkedList, strings);

        System.out.println("LinkedList");
        System.out.println(linkedList);
        linkedList.addFirst("qwe");
        System.out.println(linkedList);
        linkedList.addLast("asd");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println();
    }
}
