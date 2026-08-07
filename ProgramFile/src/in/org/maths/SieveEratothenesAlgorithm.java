package in.org.maths;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveEratothenesAlgorithm {
    public static ArrayList<Integer> countPrime(int num) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] sev = new boolean[num+1];
        Arrays.fill(sev,true);
        sev[0]=false;
        sev[1]=false;
        for(int i=2;i*i<=num;i++) {
            if (sev[i]) {
                for (int mul = i * i; mul <= num; mul+=i) {
                    sev[mul] = false;
                }
            }
        }
        for(int i = 2;i<=num;i++){
            if (sev[i]){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       int num = 36;
        ArrayList<Integer> integers = countPrime(num);
        for (int ran : integers){
            System.out.print(ran+" ");
        }
    }
}

//    public static int countPrime(int num){
//        if(num<=2){
//            return 0;
//        }
//        boolean[] isPrime = new boolean[num];
//        Arrays.fill(isPrime,true);
//        int count = 1;
//        for (int i = 3;i<=Math.sqrt(num);i+=2){
//            if(isPrime[i]){
//                count++;
//                for(int mul = i*i;mul<num;mul=mul+i){
//                    isPrime[mul] = false;
//                }
//            }
//        }
//        int root = (int) Math.sqrt(num);
//        int oddSqrt =  root+((root%2==1)?2:1);
//        for(int i = oddSqrt;i<num;i+=2){
//            if(isPrime[i]){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int num = 36;
//        int countOfPrime = countPrime(num);
//        System.out.print(countOfPrime+" ");
