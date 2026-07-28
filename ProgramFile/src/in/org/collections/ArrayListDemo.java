package in.org.collections;

import in.org.exampleclass.Laptop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        Laptop dell = new Laptop(40000,8,true);
        Laptop lenovo = new Laptop(50000,6,false);
        Laptop hp = new Laptop(40000,10,true);
        Laptop aruze = new Laptop(80000,16,true);
        Laptop amma = new Laptop(20000,6,false);
        Laptop appa = new Laptop(15000,8,false);

        List<Laptop> laptoplist = new ArrayList();
        laptoplist.add(dell);
        laptoplist.add(lenovo);
        laptoplist.add(hp);
        laptoplist.add(aruze);
        laptoplist.add(amma);
        laptoplist.add(appa);
        System.out.println("Before sort"+laptoplist);
        ComparatorDemo cmp = new ComparatorDemo();
        Collections.sort(laptoplist,cmp);
        System.out.println("After Sort"+laptoplist);
    }
}
