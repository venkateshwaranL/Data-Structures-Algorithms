package in.org.arrays;

import java.util.Scanner;

public class SimpleTwoPointer {
    public static void main(String[] args) {
        System.out.println("Enter the Name: ");
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        int size = name.length();
        int firstSize = 0;
        int lastSize = size-1;
        boolean flag = true;
        while(firstSize < lastSize){
            if(name.charAt(firstSize)!=name.charAt(lastSize)){
                flag=false;
                break;
            }
            firstSize++;
            lastSize--;
        }
        System.out.println(flag);
    }
}
