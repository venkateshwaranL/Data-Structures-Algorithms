package in.org.maths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = obj.nextInt();
        boolean flag = true;
        if(num < 2){
            flag = false;
        }
        for(int i=2;i<num;i++){// TC --- > O(n),SC---> O(1) (for(int i=2;i*i<=num;i++)---TC-->O(√n),SC-->O(1))
            if(num%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(num+" is Prime Number.");
        }
        else{
            System.out.println(num+" is Not a Prime Number");
        }
        obj.close();
    }
}
