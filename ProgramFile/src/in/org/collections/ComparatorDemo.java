package in.org.collections;

import in.org.exampleclass.Laptop;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Laptop l1 = (Laptop) o1;
        Laptop l2 = (Laptop) o2;
        if(l1.getPrice()>l2.getPrice()){
            return -1;
        } else if (l1.getPrice()<l2.getPrice()) {
            return +1;
        } else if (l1.getRam() > l2.getRam()) {
            return -1;
        } else if (l1.getRam() < l2.getRam()) {
            return +1;
        }else {
            return 0;
        }
    }
}
//        String s1 = (String) o1;
//        String s2 = o2.toString();
//        return s1.compareTo(s2);//--->Lexicographical Sorting
//        int result = s1.compareTo(s2);
//        if(result>0){
//            return +1;
//        } else if (result < 0) {
//            return -1;
//        }else {
//            return 0;
//        }//---> use to find the order
//        if(s1.length() < s2.length()){
//            return -1;
//        } else if (s1.length() > s2.length()) {
//            return +1;
//        }else {
//            return 0;
//        }//--->use to Find the Length of sort