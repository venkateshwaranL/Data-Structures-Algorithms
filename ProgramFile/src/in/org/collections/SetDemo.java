package in.org.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set ls = new LinkedHashSet();
        Set ts = new TreeSet();
        hs.add("Venkateshwaran");
        hs.add("Rangaraj");
        hs.add("Bhuveneswari");
        ls.add("viky");
        ls.add("Karthich");
        ls.add("Bala");
        ls.add("Raj");
        ts.add("Saranya");
        ts.add("Ram");
        ts.add("Nizer");
        ts.add("Viswanth");
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
