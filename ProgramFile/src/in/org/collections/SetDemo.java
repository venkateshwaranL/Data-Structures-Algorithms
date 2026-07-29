package in.org.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set ls = new LinkedHashSet();
        TreeSet ts = new TreeSet();
        hs.add("Venkateshwaran");
        hs.add(55);
        hs.add("Bhuveneswari");
        hs.add(null);
        hs.add(null);
        ls.add("viky");
        ls.add("10");
        ls.add("Bala");
        ls.add("Raj");
        ts.add("Saranya");
        ts.add("Ram");
        ts.add("Nizer");
        ts.add("0"+9);
        ts.add("0"+1);
        ts.add("1"+55);
//        ts.add(10);//.ClassCastException
        for(Object name : hs){
            System.out.print(name+" ");
        }
        System.out.println("***********");
        for (Object names : ls){
            System.out.print(names+" ");
        }
        System.out.println("**********");
        for (Object treeset : ts){
            System.out.print(treeset+" ");
        }
    }
}
