package by.banadysev.stage1.part3.task3;

import java.util.Scanner;

public class App {
    public static void main(String []args ) {
        Scanner reader = new Scanner(System.in);
        int n = 1;
        int sum = 0;
        while (n <= 100) {
            n = (n*n);
            sum = (sum + n);
            n++;
        }
        System.out.println(sum);
    }
}

