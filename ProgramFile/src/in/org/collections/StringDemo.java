package in.org.collections;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String:");
        String name = obj.nextLine().toLowerCase();
        int[] freq = new int[256];
        for(int i = 0;i<name.length();i++){
            freq[name.charAt(i)]++;
        }
        for(int i = 0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char) i +" = "+freq[i]);
            }
        }
    }
}
