package in.org.collections;

import java.util.*;

public class StringMapDemo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String :");
        String name = obj.nextLine().toLowerCase();
        Map<Character,Integer> mp = new TreeMap<>();
        char[] ch = name.toCharArray();
        for (char res : ch){
//            if(res == ' '){
//                continue;
//            }// if you don't want a any char means use this one
            if(mp.containsKey(res)){
                mp.put(res,mp.get(res)+1);
            }else {
                mp.put(res,1);
            }
        }
        System.out.println(mp);
    }
}