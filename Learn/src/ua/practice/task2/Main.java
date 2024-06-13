package ua.practice.task2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number a: ");
        double a = sc.nextDouble();
        System.out.println("Number b: ");
        double b = sc.nextDouble();
        if (a > b){
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }
}
