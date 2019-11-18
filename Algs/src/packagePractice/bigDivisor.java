package packagePractice;

import java.util.Scanner;

/*
    辗转相除法求最大公约数
    最小公倍数*最大公倍数=两个数的乘积
 */
public class bigDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int multiple = num1*num2;
        if (num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while (num2!=0){
            int temp = num1%num2;
            num1 = num2;
            num2 = temp;
        }
        int divisor = num1;
        System.out.println("the bigDivisor is : "+divisor);
        System.out.println("the littleMultiple is : "+multiple/divisor);
    }
}
