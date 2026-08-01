package in.org.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(101,"Venkatesh");
        map.put(102,"Saranya");
        map.put(103,"Rangaraj");
        map.put(105,"Bala");
        map.put(104,"Ram");
        System.out.println(map);
        Map mp = new LinkedHashMap<>();
        mp.put(101,"Sri");
        mp.put(104,"Jaga");
        mp.put(103,"Siva");
        System.out.println(mp);
        Map tm =new TreeMap<>();
        tm.put(109,"Jeeva");
        tm.put(104,"Sai");
        tm.put(101,"Sandy");
        System.out.println(tm);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        Set setview = tm.keySet();
        System.out.println(setview);
        Collection valuesview = tm.values();
        System.out.println(valuesview);
        Set setKey = tm.entrySet();
        System.out.println(setKey);
        Iterator iterator = setKey.iterator();
        while (iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
            if (me.getKey().equals(109)){
                me.setValue("SaiVenkatesh");
            }
            System.out.println(me);
        }
        boolean linkedTreeKey = mp.containsKey(101);
        System.out.println(linkedTreeKey);
        boolean hashMapValue = map.containsValue("Saranya");
        System.out.println(hashMapValue);
    }
}
