package in.org.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysLearning {
    String name;
    public ArraysLearning(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

//        ArraysLearning a1 = new ArraysLearning("Ram");
//        ArraysLearning a2 = new ArraysLearning("Sridhar");
//        ArraysLearning a3 = new ArraysLearning("Jaga");
//        ArraysLearning[] abc = {a1,a2,a3};
////        Arrays.sort(abc);
//        for(int i=0;i<abc.length;i++){
//            System.out.println(abc[i]);
//        }
        String[] names = {"Venkatesh","Saranya","Rangaraj","Bala","Venki","Shradha"};
        System.out.println("Before Sorting...");
        for(String name : names){
            System.out.print(name+" ");
        }
//        System.out.println();
//        System.out.println("After");
//        Arrays.sort(names);
//        for(String name : names){
//            System.out.print(name+" ");
//        }
//        System.out.println();
        Comparator<String> comp = new ComparatorDemo();
        Arrays.sort(names,comp);
        System.out.println("After Sort");
        for(String name : names){
            System.out.print(name+" ");
        }
    }
}