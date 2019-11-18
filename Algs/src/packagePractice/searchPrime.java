package packagePractice;

public class searchPrime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101;i <= 200;i ++){
            if (prime(i)){
                System.out.print(i+" ");
                count ++;
            }
        }
        System.out.println();
        System.out.println("the number of prime is: "+count);
    }
    private static boolean prime(int n){
//        for (int i = 2;i < n;i ++)
        for (int i = 2;i <= Math.sqrt(n);i ++)        //decrease the running time
            if (n % i == 0)
                return false;
        return true;
    }
}
