package in.org.maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = obj.nextInt();
        int res=0;
        while (num>0){
            int digit = num%10;
            res=res*10+digit;
            num=num/10;
        }
        System.out.println(res);
    }
}
