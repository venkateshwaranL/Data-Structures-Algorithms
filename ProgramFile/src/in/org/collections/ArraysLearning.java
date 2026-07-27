package in.org.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysLearning {
    public static void main(String[] args) {
        int[] arr = {5,8,7,9,4,10,6,1};
        for(int i: arr){
            System.out.print(i+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("After");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        String[] names = {"Venkatesh","Saranya","Rangaraj","Bala"};
        for(String name : names){
            System.out.print(name+" ");
        }
        System.out.println();
        System.out.println("After");
        Arrays.sort(names);
        for(String name : names){
            System.out.print(name+" ");
        }
        System.out.println();
        Comparator comp = new ComparatorDemo();
        Arrays.sort(names,comp);
        System.out.println("After Sort");
        for(String name : names){
            System.out.print(name+" ");
        }
    }
}