package in.org.maths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = obj.nextInt();
        int temp = num;
        int res = 0;
        while(num > 0){
            int digit = num % 10;
            res = (res*10)+digit;
            num = num / 10;
        }
        boolean output = temp == res ;
        System.out.println(output);
    }
}
