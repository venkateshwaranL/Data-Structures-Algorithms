package in.org.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDemo2 {
    public static void main(String[] args) {
        String name = "Venkateshwaran".toLowerCase();
        char[] ch = name.toCharArray();
        Map<Character,Integer> mp = new HashMap<>();
        for(char res : ch){
            if(mp.containsKey(res)) {
                mp.put(res, mp.get(res) + 1);
            }else {
                mp.put(res,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = mp.entrySet();
        for(Map.Entry<Character, Integer> entery : entries){
            if(entery.getValue()>1){
                System.out.println(entery.getKey()+":"+entery.getValue());
            }
        }
    }
}
