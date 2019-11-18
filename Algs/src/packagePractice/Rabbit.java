package packagePractice;

import java.util.Scanner;

public class Rabbit {
//    Integer firstMouth = 1;
//    Integer secondMouth = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //represent the mouth
        System.out.println("the number of rabbits in mouth "+n+" is: "+fun(n));
    }

    private static int fun(int n){
        if (n == 1 || n == 2)
            return 1;
        else
            return fun(n-1)+fun(n-2);
    }
}
