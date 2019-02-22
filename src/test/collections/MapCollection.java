package test.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
    // HashMap работает строго быстрее TreeMap.
    //
    // У HashMap время доступа к отдельному элементу — O(1) при условии,
    // что хэш-функция (Object.hashCode()) определена нормально (что является правдой в случае Integer).
    //
    // Общая рекомендация — если не нужна упорядоченность, использовать HashMap.
    // Исключение — ситуация с вещественными числами, которые в качестве ключей почти всегда очень плохи.
    // Для них нужно использовать TreeMap, предварительно поставив ему компаратор,
    // который сравнивает вещественные числа так, как это нужно в данной задаче. Например,
    // для обычных геометрических задач два вещественных числа могут считаться равными,
    // если отличаются не более, чем на 1e-9.

    // Некоторые методы HashTable синхронизированы, поэтому она медленнее HashMap.
    //
    // HashTable синхронизирована, а HashMap нет.
    // HashTable не позволяет иметь null ключи или значения.
    // HashMap позволяет иметь один null ключ и сколько угодно null значений.
    // У HashMap есть подкласс LinkedHashMap, который добавляет возможности по итерации.
    // Если вам нужна эта функциональность, то можно легко переключаться между классами.
    // Общее замечание — не рекомендуется использовать HashTable даже в многопоточных приложениях.
    // Для этого есть ConcurrentHashMap.

    public void setHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Name");
        hashMap.put(1, "Text");

        System.out.println("HashMap");
        System.out.println(hashMap.get(0));
        System.out.println(hashMap.get(1));

        hashMap.replace(1, "Name2");
        System.out.println(hashMap.get(0));
        System.out.println(hashMap.get(1));

        hashMap.remove(0);
        System.out.println(hashMap.get(0)); //null
        System.out.println(hashMap.get(1));
        System.out.println();
    }

    public void setLinkedHashMap(){
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(0, "Red");
        linkedHashMap.put(1, "Green");
        linkedHashMap.put(2, "Blue");

        System.out.println("LinkedHashMap");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

    // TreeMap реализован на красно-черном дереве, время добавления/поиска/удаления элемента — O(log N),
    // где N — число элементов в TreeMap на данный момент.

    // Класс ТгееМар полностью реализует интерфейс SortedMap.
    // Он реализован как бинарное дерево поиска, значит его элементы хранятся в упорядоченном виде.
    // Это  значительно ускоряет поиск нужного элемента. Порядок задается либо естественным следованием элементов,
    // либо объектом, реализующим интерфейс сравнения Comparator.
    public void setTreeMap(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        int[] keys = new int[] {5, 3, 1, 0, 4, 2};
        String[] strings = new String[] {"0", "1", "2", "3", "4", "5"};

        for (int i=0; i<strings.length;i++){
            treeMap.put(keys[i], strings[i]);
        }

        System.out.println("TreeMap");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(treeMap.tailMap(3));
    }
}
