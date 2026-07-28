package in.org.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.add(15);
        obj.add(25);
        obj.add(55);
        obj.add("Venkatesh");
        obj.add("Saranya");
        System.out.println(obj);
        obj.addFirst("Ranga");
        System.out.println(obj);
        obj.addLast("Bhuvaneswari");
        System.out.println(obj);
        obj.offer("Venki");
        System.out.println(obj);
        obj.offerFirst("Hi");
        System.out.println(obj);
        obj.offerLast("Bye");
        System.out.println(obj);
    }
}