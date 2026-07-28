package in.org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CursorsDemo {
    public static void main(String[] args) {
        List ar = new ArrayList();
        ar.add("Venkatesh");
        ar.add("Saranya");
        ar.add("Bala");
        ar.add(5);
        System.out.println("Before"+ar);
        Iterator iter = ar.iterator();
        while (iter.hasNext()){
            if (iter.next().equals(5)){
                iter.remove();
            }
        }
        System.out.println("After"+ar);//Single Directional Cursor (hasNext())
    }
}
