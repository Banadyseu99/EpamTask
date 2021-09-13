package by.banadysev.stage1.part3.task5;

import java.util.Scanner;

public class App {
    public static void main(String []args ) {
        boolean isExecuted = true;
        Scanner in = new Scanner(System.in);

        System.out.println("Let's calculate");
        System.out.print("Enter e = : ");

        double e = in.nextDouble();
        double a =0;
        double n=0;
        double sum=0;

        while (isExecuted) {
            a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            if (a >= e)
                sum = sum + a;
            else{
                isExecuted = false;}
            n++;
                }
                System.out.println("Value="+String.format("%.3f",sum));
            }
}


