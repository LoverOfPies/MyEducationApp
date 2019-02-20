package test.collections;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class SetCollection {

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
}
