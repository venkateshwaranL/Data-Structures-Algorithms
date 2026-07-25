package in.org.maths;

import java.util.Scanner;

public class SumOfOddN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = obj.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2==1){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
