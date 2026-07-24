package in.org.maths;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String :");
        String name = obj.nextLine();
        String lowerCase = name.toLowerCase();
        int[] frequency = new int[256];
        for(int i=0;i<lowerCase.length();i++){
            frequency[lowerCase.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(frequency[i]>0){
                System.out.println((char)i+" = "+frequency[i]);
            }
        }
        obj.close();
    }
}
