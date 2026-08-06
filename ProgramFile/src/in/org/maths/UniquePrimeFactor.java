package in.org.maths;

import java.util.LinkedList;

public class UniquePrimeFactor {
    public static LinkedList<Integer> isPrimeFactor(int num){
        LinkedList<Integer> ans = new LinkedList<>();
        for(int i=2;i*i <= num;i=(i==2?i+1:i+2)){
            if(num%i==0){
                ans.add(i);
                while(num%i==0){
                    num/=i;
                }
            }
        }
        if(num >1){
            ans.add(num);
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 36;
        LinkedList<Integer> primeFactor = isPrimeFactor(num);
        for(int res : primeFactor){
            System.out.print(res+" ");
        }
    }
}
