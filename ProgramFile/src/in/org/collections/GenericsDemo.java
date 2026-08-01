package in.org.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(50);
        al.add(10);
        al.add(25);
        al.add(75);
        al.add(1);
        al.add(10+50);
        System.out.println(al);
        ListIterator<Integer> integerListIterator = al.listIterator();
        while (integerListIterator.hasNext()){
            if (integerListIterator.next().equals(60)){
                integerListIterator.set(30);
            }
        }
        System.out.println(al);
    }
}
