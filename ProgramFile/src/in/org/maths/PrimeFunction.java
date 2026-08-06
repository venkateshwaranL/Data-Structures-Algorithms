package in.org.maths;

public class PrimeFunction {
    public static boolean isPrime(int num){
        boolean flag = true;
        if(num < 1){
            flag = false;
        }
        for (int i =2;i<num;i++){
            if(num%i==0){
                flag=false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int num = 4;
        boolean res = isPrime(num);
        System.out.println(res);
    }
}
