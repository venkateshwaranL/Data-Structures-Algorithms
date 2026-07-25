package in.org.maths;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = obj.nextInt();
        int sum=0;
        int res = (num*(num+1))/2;//Formula ---> O(1)
        System.out.println(res);
//        for(int i=1;i<=num;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum); // O(n)
    }
}
