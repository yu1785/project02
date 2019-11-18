package packagePractice;

public class shuiXianHua {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 100;i < 1000;i ++){
            int bai = i/100;
            int shi = i%100/10;
            int ge = i%10;
            if (i == (bai*bai*bai)+(shi*shi*shi)+(ge*ge*ge)){
                count ++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("the total number is : "+count);
    }
}
