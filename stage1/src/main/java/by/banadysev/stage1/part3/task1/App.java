package by.banadysev.stage1.part3.task1;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <=0) {
                throw new IOException("Should be more than 0");
            }
            int sum = 0;
            for (int i=1; i<= n; i++){
                sum = sum + i;
            }
            System.out.println (sum);
        } catch (IOException e) {

        }

    }
}

