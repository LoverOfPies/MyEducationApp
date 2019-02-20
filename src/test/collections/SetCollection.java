package test.collections;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class SetCollection {

    // SortedSet<E> наследует java.util.Set<E>.
    // Реализации этого интерфейса, помимо того что следят за уникальностью хранимых объектов,
    // поддерживают их в порядке возрастания. Отношение порядка между объектами может быть определено,
    // как с помощью метода compareTo интерфейса java.lang.Comparable<T>, так и
    // при помощи специального класса-компаратора, наследующего интерфейс java.util.Comparator<T>.
    public void setSortedSet(){
        SortedSet<Integer> numberSet = new TreeSet<>();
        int array[] = new int[] {7,3,6,8,0,5,1,2,4,9};

        for (int i=0; i < array.length; i++){
            numberSet.add(array[i]);
        }
        System.out.println("SortedSet");
        System.out.println(numberSet.first());
        System.out.println(numberSet);
        numberSet.add(4);
        numberSet.add(-1);
        System.out.println(numberSet);
        System.out.println();
    }

    public void setNavigableSet(){
        NavigableSet<Integer> numberSet = new TreeSet<>();
        int array[] = new int[] {0, 2, 4, 6, 8};

        for (int navigableArray : array){
            numberSet.add(navigableArray);
        }
        System.out.println("NavigableSet");
        System.out.println(numberSet.floor(5));
        System.out.println(numberSet.lower(4));
        System.out.println(numberSet);
        System.out.println();
    }

    // TreeSet
    // - время для базовых операций add(), remove(), contains() — log(n)
    // - гарантирует порядок элементов
    // - не предоставляет каких-либо параметров для настройки производительности
    // - предоставляет дополнительные методы для упорядоченного списка: first(), last(), headSet(), tailSet() и т.д.

    // TreeSet<E> наследует java.util.SortedSet<E> — коллекция, которая хранит свои элементы в виде
    // упорядоченного по значениям дерева. TreeSet инкапсулирует в себе TreeMap,
    // который в свою очередь использует сбалансированное бинарное красно-черное дерево для хранения элементов.
    // TreeSet хорош тем, что для операций add, remove и contains потребуется гарантированное время log(n).
    public void setTreeSet(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        int array[] = new int[] {0, 1, 2, 3, 4, 5};

        for (int i=0; i < array.length; i++){
            treeSet.add(array[i]);
        }
        System.out.println("TreeSet");
        System.out.println(treeSet.size());
        System.out.println(treeSet.remove(4));
        System.out.println(treeSet.remove(4));
        System.out.println(treeSet);
        System.out.println();
    }

    // HashSet гораздо быстрее чем TreeSet (константное время против логарифмического для большинства операций,
    // таких как add, remove, contains), но TreeSet гарантирует упорядоченность объектов. Оба не синхронизированы.

    //HashSet
    // - предоставляет константное время для add(), remove(), contains() и size()
    // - порядок элементов в контейнере может меняться
    // - производительность итерации по контейнеру зависит от емкости и «коэффициента загрузки»
    // (рекомендуется оставлять load factor значением по умолчанию равным 0.75,
    // что является хорошим компромиссом между временем доступа и объемом хранимых данных)

    // Название Hash… происходит от понятия хэш-функция. Хэш-функция — это функция,
    // сужающая множество значений объекта до некоторого подмножества целых чисел.
    // Класс Object имеет метод hashCode(), который используется классом HashSet для эффективного размещения объектов,
    // заносимых в коллекцию. В классах объектов, заносимых в HashSet, этот метод должен быть переопределен (override).
    public void setHashSet(){
        Set<Integer> hashSet = new HashSet<>();
        int array[] = new int[] {0, 4, 1, 5, 3, 2};

        for (int i=0; i < array.length; i++){
            hashSet.add(array[i]);
        }
        System.out.println("HashSet");
        System.out.println(hashSet);
        System.out.println();
    }

    public void setLinkedHashSet(){
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        int array[] = new int[] {0, 4, 1, 5, 3, 2};

        for (int i=0; i < array.length; i++){
            linkedHashSet.add(array[i]);
        }
        System.out.println("LinkedHashSet");
        System.out.println(linkedHashSet);
        linkedHashSet.add(0);
        linkedHashSet.add(12);
        System.out.println(linkedHashSet);
        System.out.println();
    }
}
