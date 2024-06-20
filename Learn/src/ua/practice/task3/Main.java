package ua.practice.task3;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int max = Integer.MIN_VALUE;

        System.out.println("Number range from?");
        int a = sc.nextInt();
        System.out.println("To:");
        int b = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(a, b);
            System.out.print(num[i] + " ");

            if(num[i] > max){
                max = num[i];
            }
        }
       System.out.println("\nBiggest is: " + max);


    }
}
