package packagePractice;

import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n+"=");
        while(!isPrime(n)){
            for (int i = 2;i <=Math.sqrt(n) && isPrime(i);i ++){
                if (n%i == 0){
                    System.out.print(i+"*");
                    n = n/i;
//                    System.out.print("(n="+n+")");
                    break;
                }
            }
        }
        System.out.print(n);
    }
    private static boolean isPrime(int n){
        for (int i = 2;i <= Math.sqrt(n);i ++)
            if (n%i == 0)
                return false;
        return true;
    }
}
