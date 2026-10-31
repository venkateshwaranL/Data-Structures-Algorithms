package in.org.arrays;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Array Length:");
        String arr[]= new String[obj.nextInt()];
        System.out.println("Enter "+arr.length+" Names");
        for(int i=0;i< arr.length;i++){
            arr[i]=obj.next();
        }
        System.out.println("Array Elements Are:");
        System.out.print("[");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
