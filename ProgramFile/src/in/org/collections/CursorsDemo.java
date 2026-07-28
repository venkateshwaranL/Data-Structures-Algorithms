package in.org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CursorsDemo {
    public static void main(String[] args) {
        List ar = new ArrayList();
        ar.add("Venkatesh");
        ar.add("Saranya");
        ar.add("Bala");
        ar.add(5);
        System.out.println("Before"+ar);
//        Iterator iter = ar.iterator();
//        while (iter.hasNext()){
//            if (iter.next().equals(5)){
//                iter.remove();
//            }
//        }
//        System.out.println("After"+ar);//Single Directional Cursor Method hasNext() , next() ,
//        add() , remove()
        System.out.println();
        ListIterator lt = ar.listIterator();
        lt.add("Ranga");
        while(lt.hasNext()){
            if (lt.next().equals(5)){
                lt.set(101);
            }
        }
        System.out.println("After ListIterator"+ar);
        /* Bidirectional cursor , can move forward and backwards
        *  metohs are  - hasNext() , next() , hasPrevious() ,previous() ,add() , remove() set() */
    }
}
