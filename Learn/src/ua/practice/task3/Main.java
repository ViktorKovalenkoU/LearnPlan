package ua.practice.task3;

import java.util.Random;


public class Main {
    public static void main(String[] args){
        Random random = new Random();

        int[] num = new int[10];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(0, 100);
            System.out.print(num[i] + " ");

            if(num[i] > max){
                max = num[i];
            }
        }
       System.out.println("\nBiggest is: " + max);


    }
}
