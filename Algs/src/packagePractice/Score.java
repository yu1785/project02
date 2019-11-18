package packagePractice;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float score = sc.nextFloat();
        System.out.println("the score is : "+score);
        String grade = (score>=90)?"A":(score<60)?"C":"B";
        System.out.println("the grade is : "+grade);
    }
}
