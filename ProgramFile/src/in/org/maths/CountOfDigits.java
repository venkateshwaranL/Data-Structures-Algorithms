package in.org.maths;

import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = obj.nextInt();
        int res=0;
        while(num > 0){
            num=num/10;
            res++;
        }
        System.out.println(res);
    }
}
