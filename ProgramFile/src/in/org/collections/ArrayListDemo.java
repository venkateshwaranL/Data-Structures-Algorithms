package in.org.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List obj = new ArrayList();
        obj.add(10);
        obj.add(28);

        System.out.println(obj);
        obj.add(1,"Venkatesh");
        obj.add(2,"Ranga");
        obj.add(28);
        obj.add("Venkatesh");
        System.out.println(obj.add(9));
        obj.add(3,"Saranya");
        System.out.println(obj);
        obj.addFirst("Bala");
        obj.addLast("Ram");
        System.out.println(obj);
    }
}
